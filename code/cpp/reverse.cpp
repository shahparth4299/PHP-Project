#include <iostream>
using namespace std;
int main() 
{
  int  num,reverse=0,temp,remainder;
    cout<<"Enter the number\n";
    cin>>num;
    temp = num;
    while (num > 0)
    {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num /= 10;
    }
    cout<<"Reverse of "<<num<<" is : "<<reverse;
}