#include <iostream>
using namespace std;
int main() 
{
  int year;
  cout<<"Enter the year\n";
  cin>>year;
  if(year % 4 == 0)
  {
    cout<<"Entered year is Leap Year";
  }
  else
  {
    cout<<"Entered year is Not a Leap Year";
  }
}