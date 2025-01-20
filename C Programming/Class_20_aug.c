#include <stdio.h>

int main() {
    int num1,num2;
    int a,s,d,f,g;
    printf("Enter the first num :");
    scanf("%d",&num1);
    printf("Enter the second num :");
    scanf("%d",&num2);
    a = num1 + num2;
    s = num1 - num2;
    d = num1*num2;
    f = num1/num2;
    g = num1%num2;
    printf("Outputs are:\nAddition : %d\nSubtraction:%d\nMultiplication:%d\nDivision:%d\nModulus:%d\nAnd this is it!",a,s,d,f,g);
    return 0;
     

}