#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
  {
    scanf("\n%d",&a[i]);
  }
  int n1,x=0;
  scanf("\n%d",&n1);
  for(i=0;i<n;i++)
  {
    if(a[i]==n1)
      x=1;
  }
  if(x==1)
    printf("%d is present in the array",n1);
  else
    printf("%d is not present in the array",n1);
  
        
}