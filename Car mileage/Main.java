#include<stdio.h>
int main()
{
  float a;
  int b,c;
  scanf("%f\n%d\n%d",&a,&b,&c);
  if(c>(a*b))
    printf("Cannot reach");
  else
    printf("Can reach");
}