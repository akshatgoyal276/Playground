#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,temp=0;
  for(i=0;i<n;i++)
  {
    scanf("\n%d",&a[i]);
    temp=temp+a[i];
  }
  printf("%d",temp);
  
}