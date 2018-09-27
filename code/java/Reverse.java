import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int  num,reverse=0,temp,remainder;
    System.out.println("Enter the number");
    num = sc.nextInt();
    temp = num;
    while (num > 0)
    {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num /= 10;
    }
    System.out.println("Reverse of "+num+" is : "+reverse);
  }
}