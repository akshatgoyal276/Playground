#include<stdio.h>
int main()
{
	int n,i;
  scanf("%d",&n);
  if(n%2==0)
  {
    i=(n-1)/2;
    printf("%d",i);
  }
  else
    printf("%d",n-1);
	
}