#include <stdio.h>

void main() 
{
  int year;
  printf("Enter the year\n");
  scanf("%d",&year);
  if(year % 4 == 0)
  {
    printf("Entered year is Leap Year");
  }
  else
  {
    printf("Entered year is Not a Leap Year");
  }
}