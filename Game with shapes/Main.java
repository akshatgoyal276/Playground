#include<stdio.h>
int main()
{
  int x,y,c;
  scanf("%d\n%d",&x,&y);
  c=2*x;
  if(c>y)
  {
    printf("circle cannot be inside a Square");
  }
  else if (c<=y)
  {
    printf("circle can be inside a square");
  }
}