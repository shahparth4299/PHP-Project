#include<iostream.h>
#include<conio.h>
void main()
{
 clrscr();
 int n,i=0,j=0,k=0,ch=0,rem=0,a[10],b[10],t=0;
 cout<<"How many numbers you want to enter"<<endl;
 cin>>n;
 cout<<"Enter the numbers"<<endl;
 for(i=0;i<n;i++)
 {
  cin>>a[i];
 }
 ch=0;
 while(ch!=3)
 {
  k=0;
  j=0;
  while(k!=10)
  {
   i=0;
  while(i<n)
  {
   if(ch==0)
   {
    rem=a[i]%10;
   }
   else if(ch==1)
   {
    rem=(a[i]/10)%10;
   }
   else
   {
    rem=(a[i]/10)/10;
   }
    if(rem==k)
    {
     b[j]=a[i];
     j++;
    }
    i++;
   }
   k++;
 }
  t=0;
  for(i=0;i<n;i++)
  {
   a[i]=b[i];
  }

  cout<<"PASS"<<ch+1<<" ";
  for(t=0;t<n;t++)
  {
   cout<<a[t]<<" ";
  }
 cout<<endl;
  ch++;
 }
 getch();
}
