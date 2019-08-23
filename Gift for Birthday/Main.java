#include<stdio.h>
int main()
{
  int x;
  scanf("%d",&x);
  
  if(x%4==0)
    printf("%d is a leap year",x);
  else
    printf("%d is not a leap year",x);
  
}