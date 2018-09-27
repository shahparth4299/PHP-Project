print"Inheritance"

class Person:
        def __init__(self,first,last):
                self.firstname = first
                self.lastname = last
        def Name(self):
                print"First Name : ",self.firstname
                print"Last Name : ",self.lastname

class Gender(Person):
        def __init__(self,first,last,gender):
                Person.__init__(self,first,last)        
                self.gender = gender
        def Gender(self):
                self.Name()
                print("Gender : ",self.gender)

class Employee(Person):
        def __init__(self,first,last,gender,emp_id):
                Gender.__init__(self,first,last,gender)
                self.emp_no = emp_id
        def Info(self):
                self.Gender()
                print"Employee Number : ",self.emp_no

per0 = Person("Matt","Willington")
per1 = Gender("Jane","Thomson","female")
per2 = Employee("Jack","Payne","male",100981)

per0.Name()
per1.Gender()
per2.Info()
