import pandas as pd
from sklearn.datasets import load_breast_cancer

# Load the breast cancer dataset from sklearn
data = load_breast_cancer()
X = pd.DataFrame(data.data, columns=data.feature_names)
y = pd.DataFrame(data.target, columns=['target'])

# Combining the features and the target variable
df = pd.concat([X, y], axis=1)

# Save the data to a CSV file
df.to_csv('machine_learning_data.csv', index=False)
print("CSV file 'machine_learning_data.csv' has been created successfully.")
