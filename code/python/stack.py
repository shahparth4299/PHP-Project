print"Inheritance"

class Person:
        def __init__(self,first,last):
                self.firstname = first
                self.lastname = last
        def Name(self):
                print"First Name : ",self.firstname
                print"Last Name : ",self.lastname

class Employee(Person):
        def __init__(self,first,last,emp_id):
                Person.__init__(self,first,last)
                self.emp_no = emp_id
        def Info(self):
                self.Name()
                print"Employee Number : ",self.emp_no

per1 = Person("Matt","Willington")
per2 = Employee("Jack","Payne",100981)

per1.Name()
per2.Info()
