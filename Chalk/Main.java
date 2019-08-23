#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  i=pow(n,0.5);
  while(i>1)
  {
    n=n+i;
    i=pow(i,0.5);
  }
  printf("%d",n-1);
    
}