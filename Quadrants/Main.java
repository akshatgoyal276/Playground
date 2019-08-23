#include<stdio.h>
int main()
{
  signed int x,y;
  scanf("%d\n%d",&x,&y);
  if(x>0 && y>0)
  {
    printf("Ist Quadrant");
  }
  else if(x<0 && y>0)
  {
    printf("IInd Quadrant");
  }
  else if(x<0 && y<0)
  {
    printf("IIIrd Quadrant");
  }
  else if(x>0 && y<0)
  {
    printf("IVth Quadrant");
  }
}