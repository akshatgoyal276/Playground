#include<stdio.h>
int main()
{
  int i,n,a;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(i=1;i<=n;i++)
  {
    a=pow(i,i);
    printf("%d ",a);
  }
}