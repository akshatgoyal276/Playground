#include<stdio.h>
int main()
{
  int n,temp;
  scanf("%d",&n);
  int a[n],i,j;
  for(i=0;i<n;i++)
  {
    scanf("\n%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(a[j+1]<a[j])
      {
        temp=a[j+1];
        a[j+1]=a[j];
        a[j]=temp;
      }
    }
  }
  printf("Sorted array is:");
  for(i=0;i<n;i++)
  {
    printf("\n%d",a[i]);
  }
  
        
}