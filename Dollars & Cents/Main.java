#include<stdio.h>
int main()
{
  int d1,c1,d2,c2,ds,cs;
  scanf("%d\n%d\n%d\n%d",&d1,&c1,&d2,&c2);
  cs=c1+c2;
  ds=d1+d2;
  while(cs>100)
  {
    cs=cs-100;
    ds=ds+1;
  }
  printf("%d\n%d",ds,cs);
}