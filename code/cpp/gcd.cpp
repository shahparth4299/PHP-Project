#include <iostream>
using namespace std;
int main() 
{
  int a,b,large,small,gcd=0,i;
  cout<<"Enter 2 numbers\n";
  cin>>a>>b;
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
  cout<<"GCD between "<<a<<" and "<<b<<" is : "<<gcd;
}