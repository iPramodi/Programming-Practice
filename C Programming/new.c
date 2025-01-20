#include <stdio.h>
//Writing a program to check if a number is divisible by 97 or not

int main() {
int a;
printf("Enter the no. which you want to check: ");
scanf("%d",&a);

if (a%97==0) {
    printf("Divisible.");

}
else {
    printf("Not Divisible ");

}
    return 0;
}