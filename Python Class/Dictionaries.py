"""a = {"Amit" : 9876543210, "Key" : "Value",'amol' : 7892384993}
print(a[1])
a = {'a1': 12, "b1": 40, "B1":{60: "Me",1:"Hermit"}}
eng2sp = {}
eng2sp["one"]="uno"
eng2sp["two"] = "dos"
eng2sp["three"] = "tres"
print(eng2sp)

eng2sp = {"one" :"uno","two": "dos", "three": "tres" }
print(eng2sp)
#####By using get method we can store the value in variable and access it
x = eng2sp.get("two")
print(x)
a = {"red balls": 78,"blue balls":90}
a["blue balls"] = 100
a["green balls"] = 150

print(a)
a.update({"blue balls":400,"green balls":800 })
print(a)
a = {"brand":"Ford","model":"Mustang","year":1964}
a["year"]= 2018
a.update({"color":"red"})
print(a)
a = {"brand":"Ford","model":"Mustang","year":1964}
a["year"]= 2018
a.update({"color":"red"})
b = a
del b["color"]
print(b)

a = {'a1': 74,"b1":63,'c1':79}
print(a)
a['b1']=39
a['c1'] =150
print(a)
del a['b1']
del a['c1']
print(a)
def xy(tup,elem):
  x=0
  for i in range(len(tup)+2):
        if tup[x] == elem :
            print(x)
            break
        elif x >=len(tup):
            x = x+1
            
        else:
            print(-1)
            break
  print(x)
xy(('p','o','k'),'k')

a = {"a1":12,"b1":14,"c1":40}
for i in a.items():
    print(i)"""
a = int(input("What is your age?"))
if (a<18 and a>0):
    print("YOur are a kid.")
elif (a>=18 and a<60):
    print("You are a adult")
elif (a<=0 or a>110):
    print("Invalid age")
else :
    print("You are a senior citizen")




