
//write a program to display array elements 
#include <stdio.h>
int main()
{
int* p;
int a[]={5,4,5,6,7,9};
p=&a[0];
printf("p=%p\n",p);
printf("a=%p\n",a);
printf("a[0]=%p\n",&a[0]);
getch();
return 0;
}




























