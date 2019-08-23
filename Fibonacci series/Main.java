#include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int j[n];
  j[0]=0;
  j[1]=1;
  printf("0 1 ");
  for(i=2;i<n;i++)
  {
    j[i]=j[i-2]+j[i-1];
    printf("%d ",j[i]);
  }
}