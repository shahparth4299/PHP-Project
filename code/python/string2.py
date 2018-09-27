#String testing

intro = "Hi! My name is Rude Quearms\n"
descript = "I like to play games"

fact = True
# the %r is imp as it represents the boolean value
joke = "He sneezed on her! %r"

# trying to add the two strings
print intro + descript
# using a variable to print the Boolean value
print joke % fact
# this will print the 'ha' 10 times
print "ha"*10

# will this help?
help = "%r %r %r"
print help %('it','is','working')
#printing itself
print help % (help,help,help)