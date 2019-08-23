#include<stdio.h>
int main()
{
  int n1,n2,sod1=0,sod2=0,i;
  scanf("%d\n%d",&n1,&n2);
  for(i=1;i<n1;i++)
  {
    if((n1%i)==0)
    {
      sod1=sod1+i;
    }
  }
  for(i=1;i<n2;i++)
  {
    if((n2%i)==0)
    {
      sod2=sod2+i;
    }
  }
  if((sod1/n1)==(sod2/n2))
    printf("Friendly Pair");
  else
    printf("Not Friendly Pair");
    
  
  
}