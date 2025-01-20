########################________FUNcTIONS And Recurssion_________###########################
'''x = 12
def demo():

    #global x 
    s = 40
    print("s is",)
  #  c = x+y
  #  print(x)
   # print(c)
def newLine():
    print()


add()
print(x)

def Function1():
    print("Hello")
    Function2()
def Function2():
    print("Python")
    Function1()
Function1()


def countdown(n):

    if n==0:
        print("Fuck\noff!")
    else:
        print(n)
        countdown(n-1)
countdown(10)'''

# Python program to display the Fibonacci sequence

def fib(t):
   if t <= 1:
       return t
   else:
       return(fib(t-1) + fib(t-2))

fib(6)
#Home work for class python 

# Python program to display the Fibonacci sequence

'''def recur_fibo(n):
   if n <= 1:
       return n
   else:
       return(recur_fibo(n-1) + recur_fibo(n-2))

nterms = 10

# check if the number of terms is valid
if nterms <= 0:
   print("Plese enter a positive integer")
else:
   print("Fibonacci sequence:")
   for i in range(nterms):
       print(recur_fibo(i))
'''