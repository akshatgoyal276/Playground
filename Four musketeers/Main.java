#include<stdio.h>
int main()
{
  float x1,x2,x3,y1,y2,y3;
  scanf("%f\n%f\n%f\n%f\n%f\n%f",&x1,&y1,&x2,&y2,&x3,&y3);
  printf("%.1f\n%.1f",((x1+x2+x3)/3),((y1+y2+y3)/3));
  return 0;
}