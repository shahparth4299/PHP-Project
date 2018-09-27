#include<stdio.h>
#include<conio.h>
int push(int F,int R,int n,int a[])
{
	if(F==1&&R==10||F==R+1)
	{
		printf("OVERFLOW CONDITION\n");
	}
	if(F==NULL)
	{
		F=R=1;
	}
	else if(R==10)
	{
		R=1;
	}
	else
	{
		a[R]=n;
		R=R+1;
		F=1;
	}
	return R;
}
int pop(int F,int R,int a[],int n)
{
	if(F==NULL)
	{
		printf("UNDERFLOW CONDITION\n");
	}
	n=a[F];
	if(F==R)
	{
		F=R=NULL;
	}
	else if(F==10)
	{
		F=1;
	}
	else
	{
		F=F+1;
	}
	return F;
}
void display(int a[],int F,int R)
{
	int i;
	printf("QUEUE LIST IS:\n");
	for(i=0;i<R;i++)
	{
		printf("%d\n",&a[i]);
	}
}
void main()
{
	int a[10],n,F=0,R=0,z,t;
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
			R=push(F,R,n,a);
			break;
			case 2:
			F=pop(F,R,a,n);
			break;
			case 3:
			display(a,F,R);
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


