#include<stdio.h>
int main()
{
  int n,i,sod=0;
  scanf("%d",&n);
  for(i=1;i<n;i++)
  {
    if((n%i)==0)
    {
      sod=sod+i;
    }
  }
  if(sod>n)
    printf("Abundant Number");
  else
    printf("Not Abundant Number");
}