import java.util.*;
class GCD{
  public static void main(String[] args) {
    int a,b,large=0,gcd=0,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    a = sc.nextInt();
    b = sc.nextInt();
    if(a == b)
    {
      gcd = large;
    }
    else if(a == 0 || b == 0)
    {
      gcd = 0;
    }
    else
    {
      large = a;
      if(a < b)
      {
        large = b;
      }
      for(i=large;i>0;i--)
      {
        
        if(a % i == 0 && b % i == 0)
        {
          gcd = i;
          break;
        }
      }
    }
    System.out.println("GCD between "+a+" and "+b+" is : "+gcd);
    }
}