#include <stdio.h>
/*
we usually use switch is place of if and else to be accurate
THere is one condition to use the swtich statement
we can only give switch arguement as char and int data type only
*/
int main()
{
    int day;
    scanf("%d",&day);

  /*  char x;
    scanf("%c",&x);
    switch(x){
    case 'y':
    printf("This is not what we want");
    case 'x':
    printf("Terminate\n");
    default :
    printf("Wrong input");
    }
*/
switch (day)
{
case 1:
    printf("Its Monday!");

    break;
case 2:
    printf("Its Tuesday!");
case 3:
    printf("Its Wednesday!");
case 4: 
   printf("Its Thrusday!");
 case 5:
   printf("Its Friday!\n");
case 6:
    printf("Its Satuarday!\n");\
case 7:
    printf("Its Sunday!\n");
default :
printf("Sorry");


}
    
    
    }