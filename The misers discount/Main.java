#include<stdio.h>
int main()
{
  float a,b,c,sum,dsum,d;
  scanf("%f\n%f\n%f",&a,&b,&c);
  sum=a+b;
  dsum=(100-c)*(a+b)/100;
  d=c*(a+b)/100;
  printf("%.2f\n%.2f\n%.2f",sum,dsum,d);
  return 0;
  
  
}