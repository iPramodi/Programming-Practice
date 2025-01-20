'''sum =0
i=0
while i<=10:
    sum +=i              #Python is a interpreted language 
    i+= 1               #If this line come before adding the sum value then the value will be 21

print(sum)'''

###########################BREAK STATEMENT############################
#Write a statement to break the statement after 10 number (Given that a range of number 1 to 100)

'''or i in range (0,11,1):
    if (i==5 and i==10):
        break            #IT GOES TO NEXT LINE IF SATISFIED and 'Countinue' make to start the loop again by skipping the next line
    print(i,end= ' ')'''


#########RANDOM#########
#There are two methods to import a library 
#import LIB_NAME and from LIB_NAME import * 

#rom random import*

'''li = [6, 4, 2, 2, 1, 6, 7, 8, 234 ,56, 34, 7, 34, 7,34, 4,3]
print(li)
r = randint(0,len(li))
t = int(input("Enter some value to replace: "))
li[r] = t
for i in range(0,5):
    x = randint(1,40)
    li.append(x)
print(li)

print(r)
print('This element has been replaced')
print(li)'''
'''x = sample(range(0,100),10)
print(x, end=" ")
print("Hi Dear User ") 
passw = "Mukesh_Ambani001"#  password
x = input("Enter password: ") #input
y=0

if x!=passw:
    for i in range(3):
        if x==passw:
            continue                             #continue just skips the next line and goes to the loop after being executed
             
        else:
            print("Try Again. ")
            break # break helps us to get outside the loop right away

elif x==passw :
    print("You have been logged in successfully.")
else:
    print("You ave been denied access")
'''
print("HI")
