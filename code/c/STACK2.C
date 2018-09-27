#include<stdio.h>
#include<conio.h>
int push(int n,int TOP,int a[])
{
	if(TOP==10)
	{
		printf("OVERFLOW CONDITION\n");
	}
	else
	{
		a[TOP]=n;
		TOP=TOP+1;
	}
	return TOP;
}
int pop(int n,int TOP,int a[])
{
	if(TOP==0)
	{
		printf("UNDERFLOW CONDITION\n");
	}
	else
	{
		n=a[TOP];
		TOP=TOP-1;
	}
	return TOP;
}
void display(int a[],int TOP)
{
	int i;
	printf("LIST OF STACK IS:\n");
	for(i=0;i<TOP;i++)
	{
		printf("%d\n",a[i]);
	}
}
void main()
{
	int a[10],n,TOP=0,z;
	clrscr();
	do
	{
		printf("Enter the 1 for push\nEnter 2 for pop\nEnter 3 for display\nEnter 4 for break\n");
		scanf("%d",&z);
		switch(z)
		{
			case 1:
			printf("Enter the number for push\n");
			scanf("%d",&n);
			TOP=push(n,TOP,a);
			break;
			case 2:
			TOP=pop(n,TOP,a);
			break;
			case 3:
			display(a,TOP);
			break;
			case 4:
			break;
			default:
			printf("INVALID CHOICE\n");
			break;
		}
	}while(z<=3);
	getch();
}

