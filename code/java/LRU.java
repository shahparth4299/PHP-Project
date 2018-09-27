import java.util.*;
class LRU{
	int p[],n,fr[],m,fs[],index,k,l,flag1=0,flag2=0,pf=0,frsize=3,i,j;
	static int pagehit=0;
	Scanner src=new Scanner(System.in);
	void read(){
		System.out.println("Enter page table size");
		n = src.nextInt();
		p = new int[n];
		System.out.println("Enter element in page table");
		for(int i=0;i<n;i++){
			p[i]=src.nextInt();
		}
		fr = new int[3];
		fs = new int[3];
	}
	void display(){
		for(i=0;i<frsize;i++){
			if(fr[i]==-1)
					System.out.print("null");
			else
				System.out.print(fr[i]);
		}
	}
	void lru(){
		for(i=0;i<frsize;i++){
			fr[i]=-1;
		}
		for(j=0;j<n;j++){
			flag1=0;flag2=0;
			for(i=0;i<frsize;i++){
				if(fr[i]==p[j]){
					flag1=1;
					flag2=1;
					pagehit++;
					break;
				}
			}
			if(flag1==0){
				for(i=0;i<frsize;i++){
					if(fr[i]==-1){
						fr[i]=p[j];
						flag2=1;
						break;
					}
				}
			}
			if(flag2==0){
				for(i=0;i<3;i++)
					fs[i]=0;
				for(k=j-1,l=1;l<=frsize-1;l++,k--){
					for(i=0;i<3;i++){
					if(fr[i]==p[k])
						fs[i]=1;
				}
			}
			for(i=0;i<3;i++){
				if(fs[i]==0)
					index=i;
			}
			fr[index]=p[j];
		}
		display();
		System.out.println();
		}
	}
	public static void main(String args[]){
		LRU a1 = new LRU();
		a1.read();
		a1.lru();
		System.out.println("Pagehit : "+pagehit);
	}
}