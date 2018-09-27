def tri(h,b):
	print"Area of Triangle : ",(0.5*h*b)
def squ(s):
	print"Area of Square : ",(s**2)
def rec(l,b):
	print"Area of Rectangle : ",(l*b)
def cir(r):
	print"Area of Circle : ",(3.14*(r**2))


print"Area Program"
print"1.Triangle"
print"2.Square"
print"3.Rectangle"
print"4.Circle"
fig = int(input("Enter 1 option : "))

if fig==1:
	h = float(input("Enter the height : "))
	b = float(input("Enter the base : "))
	tri(h,b)
elif fig==2:
	s = int(input("Enter the length of side : "))
	squ(s)
elif fig==3:
	l = float(input("Enter the length : "))
	b = float(input("Enter the base : "))
	rec(l,b)
elif fig==4:
	r = float(input("Enter the radius : "))
	cir(r)
else:
	print"Invalid Input"
