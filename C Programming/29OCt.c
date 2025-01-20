#include <stdio.h>
#include <string.h>


int main() {
    char s1[20] = "Hello"; //THis thing is equivalent to {'H','e','l','l','o'}
    char s2[20] = "Class";
    char s3[20];
  /*char *r;
    char *u;
   char *l;

   r = strrev(s1);
  u=strupr(s1);
   //l = strlwr(s1);       // s3[2] = '\0'; 

    //strncpy(s3,s2,5); //In this strncpy() we have to assign the null value to the next index because it takes garbage value
   // s1[3] = '\0';
//strncat(s1,s2,3); We don't have to assign null value in strncat()


   
  printf("%s\n",r);
   printf("%s\n",u);
  printf("%s\n",l);*/
  int l;
  l = strncmp("AXYZ","A",1);
  printf("%d",l);

   /* strcpy(s1,s2);
    strcat(s1,s2);
    strcmp(s1,s2);
    strrev(s1);
    strupr(s1);
    str*/

    return 0;
}