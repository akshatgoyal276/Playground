#include<stdio.h>
int main()
{
  int w,x,y;
  scanf("%d\n%d\n%d",&w,&x,&y);
  printf("%d",(w*(x-y))-100);
  return 0;
}