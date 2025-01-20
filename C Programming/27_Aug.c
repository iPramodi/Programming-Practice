#include <stdio.h>
#include <conio.h>
main()
{
    int age;
    printf("Enter your age : ");
    scanf("%d",&age);
    if (age>=18)
    {
    printf("Your age is: %d \nYou are Adult",age);
    }
    else {
         printf("Your age is: %d \nYou are not Adult",age);
    }
    getch();
    return 0;
}