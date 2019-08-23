#include<stdio.h>
int main()
{
  char a;
  int b;
  scanf("%c",&a);
  b=a;
  if(65<=b && b<=90)
    printf("Upper");
  else 
    printf("Symbol");
}