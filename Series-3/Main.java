#include<stdio.h>
int main()
{
  int n,i,c=5;
  scanf("%d",&n);
  printf("Enter n value\n");
  for(i=0;i<n;i++)
  {
    c=c+(i*2)+1;
    printf("%d ",c);
  }
  
}