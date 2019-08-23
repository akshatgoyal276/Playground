#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,j;
  for(i=0;i<n;i++)
  {
    scanf("\n%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    int count=0;
    for(j=i;j>=0;j--)
    {
      if(a[i]<a[j-1])
      {
        count++;
        break;
      }
      else if(a[i]>=a[j])
        count++;
    }
    printf("%d\n",count);
  }   
}