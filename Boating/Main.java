#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if(a>=((b*70)+(c*30)))
    printf("Boat is stable");
  else
    printf("Boat will drow");
}