#include <stdio.h>
int callByValue(int n);
int main(void) 
{
    int number = 5 ;
    printf("The orignal value of number is %d", number);
    callByValue(number);
    printf("\nThe new Value of no. is %d\n", number);

}
int CallByValue(int n) {
    return n*n*n;
    

}