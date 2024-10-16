
# def person(name, age, address):
#     return {"name": name, "age": age, "address": address};

# def greeting(person):
#     print(f"Hello, my name is {person["name"]} and I am {person["age"]} years old.")

# me = person("sn3", 100, "45 Main St")
# greeting(me)



#person
class Person:

    #constructor
    def __init__(self,name, age, address):
        self.name = name
        self.age = age
        self.address = address

    #method
    def greeting(self):
        print(f"Hello, my name is {person["name"]} and I am {person["age"]} years old.")



me = Person("sn3", 100, "45 Main St")#Object


print(me.name) #sn3
print(me.age) #100
print(me.address) #"45 Main St"
