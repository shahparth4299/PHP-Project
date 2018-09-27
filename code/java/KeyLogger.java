import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class KeyLogger extends Frame implements KeyListener{
	Label l1;
	public KeyLogger()
	{
		setTitle("KEYLOGGER");
		setSize(400,400);
		setVisible(true);
		l1=new Label();
		addKeyListener(this);
		add(l1);
	}
	public void keyTyped(KeyEvent e)
	{
		l1.setText("KEY IS TYPED");
		display(e);
	}
	public void keyPressed(KeyEvent e)
	{}
	public void keyReleased(KeyEvent e)
	{}
	public void display(KeyEvent e)
	{
		int id=e.getID();
		try{
		OutputStream f1=new FileOutputStream("key.txt",true);
		if(id==KeyEvent.KEY_TYPED){
			char c=e.getKeyChar();

			System.out.println(c);
			f1.write(c);
		}
		f1.close();
	}catch(Exception wwe)
	{
			System.out.print(wwe);
	}
	}
	public static void main(String  a[])
	{
		new KeyLogger();
	}
} 