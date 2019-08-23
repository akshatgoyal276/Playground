#include<stdio.h>
int main()
{
  float b,p,h;
  scanf("%f\n%f",&b,&p);
  h=pow((b*b+p*p),.5);
  printf("%.2f",h);
}