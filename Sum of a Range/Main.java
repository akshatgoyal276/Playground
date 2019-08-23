#include<stdio.h>
int main()
{
  int s,e,i,c=0;
  scanf("%d\n%d",&s,&e);
  for(i=s;i<=e;i++)
  {
    c=c+i;
  }
  printf("%d",c);
}