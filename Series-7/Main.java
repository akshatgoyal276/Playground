#include<stdio.h>
int main()
{
  int n,i,c1=10,c2=5;
  scanf("%d",&n);
  printf("Enter n value \n%d %d",c1,c2);
  for(i=2;i<n;i++)
  {
    if(i%2==0)
    {
      c1=c1+50;
      printf(" %d",c1);
    }
    else
    {
      c2=c2+10;
      printf(" %d",c2);
    }
  }
    
}