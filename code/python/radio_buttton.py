from Tkinter import *
import Tkinter
def sel():
   selection = "You selected the option " + str(var.get())
   label.config(text = selection)

root = Tk()
var = IntVar()
R1 = Radiobutton(root, text="Option 1", variable=var, value=1)
R1.pack()

R2 = Radiobutton(root, text="Option 2", variable=var, value=2)
R2.pack(  )

R3 = Radiobutton(root, text="Option 3", variable=var, value=3)
R3.pack()

B = Tkinter.Button(root, text="Click",command=sel)

label = Label(root)
label.pack()
B.pack()
root.mainloop()
