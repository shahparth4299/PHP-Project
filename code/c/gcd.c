#include <stdio.h>

void main() {
  int a,b,large,small,gcd=0,i;
  printf("Enter 2 numbers\n");
  scanf("%d%d",&a,&b);
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
  printf("GCD between %d and %d is : %d",a,b,gcd);
}