#include<stdio.h>
int main()
{
  int n,a[120],j=0,i;
  scanf("%d",&n);
  while(n!=0)
  {
    a[j++]=n%2;
    n=n/2;
  }
  for(i=j-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  
}