import numpy as np
'''x = np.linspace(10,20,10)
print(x)
############################################33

a = [[1,2,3],[4,5,6],[7,8,9]]
print(np.shape(a))
print(np.sum(a))
print(np.sum(a,axis=0))
print(np.sum(a,axis=1))
###############################################
a = np.array([1,2,3])
b= np.asarray(b)
c = a+b
print(c)
#############################################

a = np.array([[0,1,2],[2,3,4],[-9,1,-1]])
b = np.amax(a,axis=1)

b1 = np.amin(a,axis=1)

print(b,b1,end="\n")
#########################################
a = np.array([[65,60,30],[1,2,3],[70,69,95]])
b=np.median(a)
print(b)
b1 = np.median(a,axis=1)
print((b1))
b2 = np.median(a,axis=0)
print(b2)
##########################################
a = np.array([[1,2,3],[4,5,6],[7,8,9]])
print(np.mean(a))
print(np.mean(a,axis=0))
print(np.mean(a,axis=1))
#################################
a = np.array([1,2,3,4])
print(np.average(a))
wts = np.array([4,3,2,1])
print(np.average(a,weights=wts))

####################################33
print(np.var([1,2,3,4]))'''
###########################...........Braod Casting........##############
'''a = np.array([1,2,3,4])
b = np.array([10,20,30,40])
c = a*b
print(c)
###################################
a = np.array([[0.0,0.0,0.0],[10.0,10.0,10.0],[20.0,20.0,20.0],[30.0,30.0,30.0]])
b = np.array([1.0,2.0,3.0])
print(a,b,a+b,end="\n")
arr = np.array([[1,2,3,4,5],[6,7,8,9,10]])                                                 #ndim telles the dimension of array
print('2nd element on 1st dim: ',arr[0,1])
print('5th element on 2nd dim: ',arr[1,4])
print('3rd element on 2st dim: ',arr[-1,-3])
print(arr.ndim)
arr = np.array([[[1,2,3],[4,5,6]],[[7,8,9],[10,11,12]]])
print(arr[0,1,2])
print(arr.ndim)'''
arr = np.array([1,2,3])
newarr = np.absolute(arr)
x = np.percentile(arr,q=1)
print(x)
