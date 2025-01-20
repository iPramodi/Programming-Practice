#Write a python program to find the max of three numbers
def addNum3(a,b,c):
    if a>=b and a>=c :
        print("The number",a, " is greater.")
    elif c>=b and c>=a:
        print("The number ", c, "is greater.")
    else:
         print("The number ",b, "is greater.")
#Program to add elements of a list
def listAdder():
    L = []
    n = int(input("How many elements you want to add: "))   
    for i in range(n):
        x = int(input("Enter elements of list: "))
        L.append(x)
    print(L)

#Alternate method to add
    L_len = len(L)
    sum_Element = 0
    for i in range(L_len):
        sum_Element = sum_Element + L[i]
    print(sum_Element)
        
'''   print("Sum of the given list is : ", sum(L))'''
#listAdder()
#Program to Multiply elements of a list
def ListMulti():
    L = []
    n = int(input("How many elements you want to multiply: "))
    for i in range(n):
        x = int(input("Enter elements of list: "))
        L.append(x)
    print(L)
    L_len = len(L)
    Product_Element = 1
    for i in range(L_len):
        Product_Element = Product_Element *L[i]
    print(Product_Element)
#ListMulti()
    

#Python program to print a reverse of a string
def Rev_Str():
     s = input("Enter string for reverse: ")
    
     print(s[::-1])
Rev_Str()

