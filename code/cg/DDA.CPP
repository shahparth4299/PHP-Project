#include&lt;iostream.h&gt;
#include&lt;graphics.h&gt;
#include&lt;conio.h&gt;
void dda(int x1,int y1,int x2,int y2)
{
	int length;
	int dx = x2 - x1;
	int dy = y2 - y1;
	if(dx < 0)
	{
		length = dx * (-1);
	}
	if(dy < 0)
	{
		length = dy * (-1);
	}
	float xinc = dx / (float)length;
	float yinc = dy / (float)length;
	float x = x1;
	float y = y1;
	for(int i=0;i<=length;i++)
	{
		putpixel(x,y,RED);
		x = x + xinc;
		y = y + yinc;
	}
}
void main()
{
	clrscr();
	int gd = DETECT,gm;
	int x1,y1,x2,y2;
	initgraph(&gd,&gm,"C://TURBOC3//BGI");
	cout<<"Enter x1,y1,x2,y2\n";
	cin>>x1>>y1>>x2>>y2;
	dda(x1,y1,x2,y2);
	getch();
	closegraph();
}