import java.io.*;
import java.util.*;
class MyThread implements Runnable{
	Thread t;
	String name;
	MyThread(String name){
		t = new Thread(this,name);
		t.start();
	}
	public void run(){
		for(int i=0;i<7;i++){
				System.out.println(t.getName()+":"+i);
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					System.out.println(e);
				}
		}
	}
}
class ThreadDemo2{
	public static void main(String args[]){
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		try{
			t2.t.join();
		}catch(Exception e){}
		MyThread t3 = new MyThread("t3");
		MyThread t4 = new MyThread("t4");
	}
}