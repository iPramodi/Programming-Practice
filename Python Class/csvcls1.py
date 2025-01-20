import cv2
import numpy as np
import tensorflow as tf

# Load the pre-trained model from TensorFlow's model zoo
model = tf.saved_model.load('W:/Programming/Python Class/ssd_mobilenet_v1_coco_2017_11_17/saved_model')

# Load label map from COCO dataset
with open('W:/Programming/Python Class/ssd_mobilenet_v1_coco_2017_11_17/mscoco_label_map.pbtxt', 'r') as file:
    classes = {}
    for line in file:
        if 'id:' in line:
            class_id = int(line.split(': ')[1])
        if 'display_name:' in line:
            display_name = line.split(': ')[1].strip().replace('\"', '')
            classes[class_id] = display_name

def detect_objects(image_np):
    # Prepare the image for the model
    input_tensor = tf.convert_to_tensor(np.expand_dims(image_np, 0), dtype=tf.float32)
    detections = model(input_tensor)

    # Post-process the raw detections to extract bounding box and class info
    bbox_data = detections['detection_boxes'][0].numpy()
    class_ids = detections['detection_classes'][0].numpy().astype(int)
    scores = detections['detection_scores'][0].numpy()

    return bbox_data, class_ids, scores

def display_detections(image_np, bbox_data, class_ids, scores, width, height, min_score_thresh=.5):
    for i in range(len(scores)):
        if scores[i] < min_score_thresh:
            continue
        class_name = classes[class_ids[i]]
        ymin, xmin, ymax, xmax = bbox_data[i]
        (left, right, top, bottom) = (int(xmin * width), int(xmax * width), int(ymin * height), int(ymax * height))
        cv2.rectangle(image_np, (left, top), (right, bottom), (0, 255, 0), 2)
        cv2.putText(image_np, f'{class_name}: {int(scores[i]*100)}%', (left, top-5), cv2.FONT_HERSHEY_SIMPLEX, 0.5, (0, 255, 0), 1)

# Start video capture
cap = cv2.VideoCapture(0)

while True:
    ret, frame = cap.read()
    if not ret:
        break
    
    # Perform object detection
    height, width, _ = frame.shape
    bbox_data, class_ids, scores = detect_objects(frame)

    # Display the results
    display_detections(frame, bbox_data, class_ids, scores, width, height)

    cv2.imshow('Object Detection', frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()
