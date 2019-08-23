#include<stdio.h>
int main()
{
  int n,c=0,i;
  scanf("%d",&n);
  printf("Enter n value\n%d ",c);
  for(i=1;i<n;i++)
  {
    c=c+(i*2)+1;
    printf("%d ",c);
  }
  
}