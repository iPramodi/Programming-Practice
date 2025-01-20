
"""import numpy as np  
x = np.array([[1,2,3],[4,5,6]])
print("x:\n{}".format(x))



from scipy import sparse
# Create a 2D numPY arrya wit a diagonal of one 
eye = np.eye(5)
print("NumPy array : \n{}".format(eye))


import pandas as p 
import numpy as np
import matplotlib.pyplot as plt
#Generate a sequence of numbers from -10 to 10 with 100 step
x = np.linspace(-10,10,100)
y = np.sin(x)

plt.plot(x,y,marker ="*", color = "r" )

import pandas as pd
#create a simpole dataset of people
data = {'Name': ["John","Anna","Peter","Linda"],
        'Location':["New York","Paris","Berlin","London"],
        'Age' : [24,13,53,33]}
data_pandas = pd.DataFrame(data,index=[100,101,102,103])
display(data_pandas)
"""
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.datasets import load_iris
iris_dataset = load_iris()
'''
print("Key of iris_dataset: \n{}".format(iris_dataset.key()))

print("Shake of data: {}".format(iris_dataset['data'.shape][:5]))


X_train, X_test, y_train, y_test = train_test_split(iris_dataset)
'''

