#include&lt;iostream.h&gt;
#include&lt;graphics.h&gt;
#include&lt;conio.h&gt;
void main()
{
	clrscr();
	int gd = DETECT,gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
	rectangle(150,100,550,300);
	getch();
	closegraph();
}