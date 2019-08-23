#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  printf("Enter n value");
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      int a=pow(i,2);
      printf("%d ",a);
    }
    else
    {
      int b=pow(i,3);
      printf("%d ",b);
    }
  }
  
}