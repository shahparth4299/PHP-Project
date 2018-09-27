import java.io.*;
import java.util.*;
class Tcp{
	public static void display(int start,int end,String name,String str){
		System.out.println(name+" : "+Integer.parseInt(str.substring(start,end),2));
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter TcpHeader Data");
		String str = sc.nextLine();
		int a[] = {16,16,32,32,4,6,1,1,1,1,1,1,16,16,16};
		String b[] = {"Source Address","Destination Address","Sequence Number","Acknowledgement Number","Hlen","Reserved","urg","ack","psh","rst","syn","fin","Window Size","Checksum","Urgent Pointer"};
		int start = 0,end = a[0];
		for(int i=1;i<a.length;i++){
			display(start,end,b[i],str);
			start = end;
			end = end + a[i];
		}
	}
}