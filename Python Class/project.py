import cv2
import os

def convert_to_pencil_sketch(image_path, sketch_style):
    # Read the image
    image = cv2.imread(image_path)

    # Convert the image to grayscale
    gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)

    # Invert the grayscale image
    inverted_image = cv2.bitwise_not(gray_image)

    # Blur the inverted image
    blurred_image = cv2.GaussianBlur(inverted_image, (111, 111), 0)

    # Invert the blurred image
    inverted_blurred_image = cv2.bitwise_not(blurred_image)

    # Create the pencil sketch by blending the original image with the inverted blurred image
    pencil_sketch = cv2.divide(gray_image, inverted_blurred_image, scale=1080.0)

    # Apply different styles to the sketch
    if sketch_style == 'gray':
        final_sketch = pencil_sketch
    elif sketch_style == 'color':
        # Convert the original image to a color pencil sketch
        color_pencil_sketch = cv2.cvtColor(image, cv2.COLOR_BGR2HSV)
        color_pencil_sketch[:, :, 2] = pencil_sketch
        final_sketch = cv2.cvtColor(color_pencil_sketch, cv2.COLOR_HSV2BGR)
    else:
        print("Invalid sketch style. Using the default (gray) sketch.")
        final_sketch = pencil_sketch

    return final_sketch

def save_sketch(image, output_path):
    # Ensure the output path has a valid image file extension
    valid_extensions = ['.png', '.jpg', '.jpeg']
    file_extension = os.path.splitext(output_path)[1].lower()

    if file_extension not in valid_extensions:
        print("Invalid file extension. Saving as a PNG file.")
        output_path += '.png'

    # Save the sketch to the specified path
    cv2.imwrite(output_path, image)
    print(f"Sketch saved to {output_path}")

def main():
    while True:
        # Get the path of the image from the user
        image_path = input("Enter the path of the image (or 'exit' to quit): ")

        if image_path.lower() == 'exit':
            break

        # Check if the file exists
        if not os.path.isfile(image_path):
            print("Invalid file path. Please enter a valid path.")
            continue

        # Get the desired sketch style from the user
        sketch_style = input("Enter sketch style ('gray', 'color', or 'exit' to quit): ")

        if sketch_style.lower() == 'exit':
            break

        # Convert the image to a pencil sketch
        pencil_sketch = convert_to_pencil_sketch(image_path, sketch_style)

        # Display the original and pencil sketch images
        cv2.imshow("Original Image", cv2.imread(image_path))
        cv2.imshow("Pencil Sketch", pencil_sketch)
        cv2.waitKey(0)  # Wait for any key press to proceed

        # Save the sketch if the user wants to
        save_option = input("Do you want to save the sketch? (yes/no): ")
        if save_option.lower() == 'yes':
            output_path = input("Enter the path to save the sketch: ")
            save_sketch(pencil_sketch, output_path)

        # Check if the user wants to continue
        continue_option = input("Do you want to convert another image? (yes/no): ")
        if continue_option.lower() != 'yes':
            break

    cv2.destroyAllWindows()

if __name__ == "__main__":
    main()
