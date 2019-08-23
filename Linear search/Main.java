#include<stdio.h>
int main()
{
  int n,f;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&f);
  for(i=0;i<n;i++)
  {
    if(a[i]==f)
    {
      printf("%d",i+1);
      break;
    }
  }
    if(i==n)
  {
    printf("%d isn't present in the array.",f);
  }
  
  
}