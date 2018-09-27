import java.io.*;
import java.util.*;
class RestoringDivision2{
  static int divisor[] = new int[]{0,0,0,0};
  static int dividend[] = new int[]{0,0,0,0};
  static int temp[] = new int[4];
  static int q[] = new int[4];
  static int acc[] = new int[]{0,0,0,0};
  static int w[] = new int[4];
  static int x[] = new int[]{0,0,0,0};
  static int i;
  public static void toBinary(int a,int b){
    int i=0,j=3;
    while(a > 0){
      dividend[j] = a % 2;
      a = a / 2;
      j--;
    }
    j=3;
    i=0;
    while(b > 0){
      divisor[j] = b % 2;
      b = b / 2;
      j--;
    }
  }
  public static void onescomp(int a[]){
    for(i=0;i<=3;i++){
      if(a[i] == 0)
        divisor[i] = 1;
      else
        divisor[i] = 0;
    }
  }
  public static void addition(int a[],int b[]){
    int carry = 0;
    for(i=3;i>=0;i--){
      temp[i] = carry ^ a[i] ^ b[i];
		  if(((carry==1)&&(a[i]==1))||((a[i]==1)&&(b[i]==1))||((b[i]==1)&&(carry==1)))
        carry=1;
      else
        carry=0;
    }
  }
  public static void leftShift(int a[],int b[]){
  int z = b[0];
    for(i=3;i>0;i--){
      if(i == 3){
        x[i-1] = b[i];
        b[i] = 0;
      }
      else{
        x[i-1] = b[i];
      }
    }
    for(i=3;i>0;i--){
      if(i == 3){
        w[i - 1] = a[i];
        w[i] = z;
      }
      else
        w[i-1] = a[i];
    }
  }
  public static void print(int a[]){
      for(i=0;i<a.length;i++){
          System.out.print(a[i]);
      }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int comp[] = new int[]{0,0,0,1};
    int bcomp[] = new int[4];
    System.out.println("Enter Dividend");
    int dividend1 = sc.nextInt();
    System.out.println("Enter Divisor");
    int divisor1 = sc.nextInt();
    toBinary(dividend1,divisor1);
    System.out.print("Dividend:");
    print(dividend);
    System.out.print("\nDivisor:");
    print(divisor);
    onescomp(divisor);
    addition(divisor,comp);
    for(i=0;i<=3;i++){
      bcomp[i] = temp[i];
      q[i] = dividend[i];
    }
    System.out.print("\nDivisor 2'sComplement:");
    print(bcomp);
    System.out.println("\nAction\tAccumulator\tDividend");
    for(int j=0;j<4;j++){
      System.out.print("ShiftLeft\t");
      leftShift(acc,q);
      for(i=0;i<=3;i++){
        acc[i] = w[i];
        q[i] = x[i];
      }
      print(acc);
      System.out.print("\t");
      print(q);
      System.out.print("\t");
      System.out.print("\nAddition\t");
      addition(acc,bcomp);
      print(temp);
      System.out.print("\n");
      if(temp[0] == 1){
        System.out.print("Restore      \t");
        q[3] = 0;
        print(temp);
        System.out.print("\t");
        print(q);
        System.out.print("\n");
      }
      else{
        System.out.print("NORESTORE\t");
        for(i=0;i<=3;i++)
          acc[i] = temp[i];
        print(acc);
        System.out.print("\t");
        q[3] = 1;
        print(q);
        System.out.print("\n");
      }
    }
    System.out.println("\n\n-------Remainder----------");
    print(acc);
    System.out.println("\n---------Quotient-------------");
    print(q);
    System.out.println("\nRemainder : "+(dividend1%divisor1));
    System.out.println("Quotient : "+(dividend1/divisor1));
  }
}