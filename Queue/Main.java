#include<stdio.h>
int main()
{
  int n,m,count=0,temp=0;
  scanf("%d %d",&n,&m);
  int a[n],i;
  for(i=0;i<n;i++)
  {
    scanf("%d ",&a[i]);
  }
  int j;
  for(i=0;i<n;i=j)
  {
    for(j=0;j<n;j++)
    {
      if((temp+a[j])<m)
      {
        temp=temp+a[j];
      }
      else
      {
        i=j;
        count++;
      }
    }
  }    
  printf("%d",count);

  
}