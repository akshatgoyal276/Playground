#include<stdio.h>

int main()
{
  float r,c,arc;
  scanf("%f\n%f",&r,&c);
  arc=2*3.14*r*c/360;
  printf("%.2f",arc);
}