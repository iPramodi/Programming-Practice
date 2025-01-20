#include <stdio.h>
int main() 
{
    int x;
    printf("Enter a number: ");
    scanf("%d",&x);
    if (x>=0){
        printf("The number is positive");
    }
    else
    {
        printf("THe number is negative.");
    }
    return 0;
}