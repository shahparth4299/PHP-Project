#include <stdio.h>
 
void main()
{
    int  num,reverse=0,temp,remainder;
    printf("Enter the number\n");
    scanf("%d", &num);
    temp = num;
    while (num > 0)
    {
        remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num /= 10;
    }
    printf("Reverse of %d is = %d\n",num,reverse);
}