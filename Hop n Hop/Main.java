#include<stdio.h>
int main()
{
  int x,y,d;
  scanf("%d\n%d",&x,&y);
  d=pow(pow(x-3,2)+pow(y-4,2),0.5);
  printf("%d",d);
  
}