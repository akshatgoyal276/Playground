#include<stdio.h>
int main()
{
  int n,i,c=1;
  scanf("%d",&n);
  for(i=n;i>0;i--)
  {
    c=c*i;
  }
  printf("%d",c);
}