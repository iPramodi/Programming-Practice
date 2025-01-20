#include <stdio.h>
int callByValue(int n);
int main(void) 
{
    int number = 5 ;
    printf("The orignal value of number is %d\n", number);
    callByValue(5);
    printf("\nThe new Value of no. is %d\n", number);

}
int callByValue(int n) {
   
   int number =  n*n*n;
   printf("%d",number);
    

}


