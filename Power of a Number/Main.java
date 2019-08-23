#include<stdio.h>
int power( int a, int b)
{
  while(b!=1)
  {
    a=a*a;
    b--;
  }
  printf("%d",a);
}
int main()
{
  int a,b;
  scanf("%d\n%d",&a,&b);
  power(a,b);
}