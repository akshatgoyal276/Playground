#include<stdio.h>
int main()
{
  int n,i,c=2,b=0;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(i=0;i<n;i++)
  {
    b=b+i*2;
    printf("%d ",b);
  }
}