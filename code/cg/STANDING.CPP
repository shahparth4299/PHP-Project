#include&lt;iostream.h&gt;
#include&lt;graphics.h&gt;
#include&lt;conio.h&gt;
void main()
{
	clrscr();
	int gd = DETECT,gm;
	initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
	line(100,0,100,450);
	getch();
	closegraph();
}