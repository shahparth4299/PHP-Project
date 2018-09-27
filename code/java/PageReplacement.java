import java.io.*;
import java.util.*;
class PageReplacement{
	static int size = 3;
	static int queue[] = new int[size];
	static int front=0,rear=-1,pagehit=0;
	public static void enqueue(int a){
		if((rear+1) >= size){
			rear = -1;
		}
		int z=0;
			for(int i=0;i<size;i++){
				if(queue[i] == a){
					z++;
					pagehit++;
				}
			}
			if(z == 0){
				rear++;
				queue[rear] = a;
			}
	}
	public static int dequeue(){
		if(rear == -1 || front == rear+1){
			System.out.println("Emty");	
		}
		else{
			int a = queue[front];
			front++;
			return a;
		}
		return 0;
	}
	public static void display(){
		for(int i=front;i<size;i++){
			if(queue[i] <= 0)
				System.out.print("null");
			else
				System.out.print(queue[i]);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		int n = sc.nextInt();
		int fifo[] = new int[n];
		int i;
		System.out.println("Enter the number");
		for(i=0;i<n;i++){
			fifo[i] = sc.nextInt();
		}
		for(i=0;i<n;i++){
			enqueue(fifo[i]);
			System.out.println();
			display();
		}
		System.out.println("\nPAGEHIT : "+pagehit);
	}
}