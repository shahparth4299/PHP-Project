from Tkinter import *
import Tkinter
import tkMessageBox
def sel():
   if check1.get()==True and check2.get()==True :
      tkMessageBox.showinfo("Test","Music and Video")
   elif check1.get()==True:
      tkMessageBox.showinfo("Test","Music")
   elif check2.get()==True:
      tkMessageBox.showinfo("Test","Video")
   else:
      tkMessageBox.showinfo("Test","Nothing")

root = Tk()
check1 = BooleanVar()
check2 = BooleanVar()

C1 = Checkbutton(text = "Music", variable = check1 , height=3, width = 20)
C2 = Checkbutton(text = "Video", variable = check2 , height=3, width = 20)

B = Tkinter.Button(text="Click", command=sel)

C1.pack()
C2.pack()
#label = Label(root)
#label.pack()
B.pack()
root.mainloop()
