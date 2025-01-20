#include <stdio.h>
int main()
{
   int a[50];
   int i, loc = -1, key,n;
   printf("\n Enter value of n:");
   scanf("%d",&n);
   printf("\n Enter the elements:");

   for(i=0;i<n;i++)
   {
   	scanf("%d",&a[i]);
   }
   printf("Enter integer value to search in array:");
   scanf( "%d", &key );
   // attempt to locate searchKey in array a
   for ( i = 0; i < n; i++ )
   {
    if ( a[i] == key )
    {
     loc = i; // location of key is stored
     break;
    } // end if
   } // end for
   if(loc!= -1)
   {
     printf("Element found at %d",loc);
   }
   else
   {
     printf("Element not found");
   }
   return 0;
} // end main
