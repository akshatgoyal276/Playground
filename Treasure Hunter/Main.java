#include<stdio.h>
int main()
{
  int a,b,c,d,e,f;
  scanf("%d\n%d\n%d",&a,&b,&c);
  d=(a*b)/100;
  e=((a-d)*c)/100;
  f=(a-d-e)/3;
  printf("%d\n%d\n%d",d,e,f);
  return 0;
  
}