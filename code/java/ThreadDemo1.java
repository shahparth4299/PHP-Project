import java.io.*;
import java.util.*;
class MyThread extends Thread{
	String name;
	MyThread(String name){
		this.name = name;
		this.setName(name);
		System.out.println(Thread.currentThread());
	}
	public void run(){
		for(int i=0;i<7;i++){
			System.out.println("Thread"+this.getName()+":"+i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class ThreadDemo1{
	public static void main(String ar[]){
		MyThread t1 = new MyThread("th1");
		MyThread t2 = new MyThread("th2");
		MyThread t3 = new MyThread("th3");
		t1.start();
		try{
			t1.join();
			System.out.println(t1.isAlive());
		}catch(Exception e){}
		t2.start();
		t3.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
	}
}