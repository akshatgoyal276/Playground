#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int c[n];
  c[0]=1;c[1]=2;
  printf("Enter n value");
  printf("\n%d %d",c[0],c[1]);
  for(i=2;i<n;i++)
  {
    c[i]=c[i-1]+c[i-2];
    printf(" %d",c[i]);
  }
  
}