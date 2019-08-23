#include<stdio.h>
int main()
{
  int n,i=1,j=1,even,odd;
  scanf("%d",&n);
  if(n%2==0)
  {
    even=i*pow(3,((n/2)-1));
    printf("%d",even);
  }
  else
  {
    odd=j*pow(2,((n-1)/2));
    printf("%d",odd);
  }
}