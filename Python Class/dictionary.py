import random
tickets= []
for i in range(0,99999):
    x = random.randint(0,99999)
    tickets.append(x)
winner_1 = random.randint(0,len(tickets))
winner_2 = random.randint(0,len(tickets))
print(tickets)
print(tickets[winner_1],tickets[winner_2])
n=[]
l=0
print("The other list will be: ", end = "\n")
for x in tickets: 
    if tickets.count(x) > 1 and x not in n:
        n.append(x)
print(n)