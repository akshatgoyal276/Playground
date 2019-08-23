#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d\n%d",&a,&b);
  if(b<=(1000*a*a*a))
     printf("Can store");
  else
    printf("Cannot store");
}