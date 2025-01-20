#include <stdio.h>

int main() {
  float USD,INR,amnt;
  char x;
  INR = 1.0;
  USD = 83.95 * INR;
  printf("What you want to Convert U(Dollar) or I(Ruppees) ?");

  scanf("%c",&x);

  if ( x == 'U')
  {
    printf("Enter INR amount to convert into USD: ");
    scanf("%f",&amnt);
    float result = amnt/USD;
    printf("%f",result);
  }
  else if (x == 'I')
  {
  printf("Enter the USD amount to convert into INR: ");
  scanf("%f",&amnt);
  float result = amnt * USD;
  printf("%f",result);
  }
  else {
    printf("Wrong INPUT!");
    
  }

}