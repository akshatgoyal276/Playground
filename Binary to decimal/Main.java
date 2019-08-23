#include<stdio.h>
int main()
{
  int i=0,n,d=0,r;
  scanf("%d",&n);
  for(i=0;i<100;i++)
  {
    if(n==0)
    {
      break;
    }
    r=n%10;
    n=n/10;
    d=d+r*pow(2,i);
  }
  printf("%d",d);
}