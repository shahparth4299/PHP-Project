import java.util.*;
class Leapyear{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int year;
    System.out.println("Enter the year");
    year = sc.nextInt();
    if(year % 4 == 0){
      System.out.println("Entered year is Leap Year");
    }
    else{
      System.out.println("Entered year is Not a Leap Year");
    }
  }
}