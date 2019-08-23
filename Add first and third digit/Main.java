#include<stdio.h>
int main()
{
  int a,s,d,f;
  scanf("%d",&a);
  s=a/100;
  d=a%10;
  f=s+d;
  printf("%d",f);
  return 0;
}