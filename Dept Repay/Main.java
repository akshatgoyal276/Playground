#include<stdio.h>
int main()
{
  int p,r,y;
  float i,a,d,f;
  scanf("%d\n%d\n%d",&p,&r,&y);
  i=p*r*y/100;
  a=p+i;
  d=i*2/100;
  f=a-d;
  printf("%.2f\n%.2f\n%.2f\n%.2f",i,a,d,f);
  return 0;
}