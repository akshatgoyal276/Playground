#include<stdio.h>
int main()
{
  int a,b,c,d;
  float e,f,g,h;
  scanf("%d\n%d\n%d\n%d",&a,&b,&c,&d);
  e=(d/6)+(0.1*(d%6));
  f=c/e;
  g=a/6;
  h=b/g;
  printf("%d\n%.1f\n%.1f\n%.1f",a/6,e,f,h);
  if(f>h)
    printf("\nEligible to Win");
  else
    printf("\nNot Eligible to Win");
    
}