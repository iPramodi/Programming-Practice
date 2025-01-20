//Calculating the lenght of the string without using String library

#include <stdio.h>
int main() {
   char c[23] = "This should be a string";
    int i = 0;
  /**/ while (c[i]!='\0')
   {
    i++;
   } 
   printf("Lenght = %d\n",i);

   for(int a = 0;a<24;a++){
    printf("This is %c\n",c[a]);
   }
   return 0;

}