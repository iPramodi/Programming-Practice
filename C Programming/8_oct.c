#include<stdio.h>

int main(){
    
    int A[10]={1,2,3,4,5};
    int N=4;
    int val,loc,i;
    printf("Array before Insertion\n");
    printf(A);
    
    printf("Enter the value to insert into A:");
    scanf("%d",&val);
    printf("Enter the loc to insert:");
    scanf("%d",&loc);
    //Insertion logic
    for(i=N;i>=loc;i--){
                       A[N+1]=A[N];
                       }
    A[loc]=val;
    printf("Array after insertion\n");
    printf(A);
   
    return 0;
    
    
    }