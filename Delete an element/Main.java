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
  int n1;
  scanf("\n%d",&n1);
  for(j=n1-1;j<n;j++)
  {
    a[j]=a[j+1];
  }
  
  printf("Array after deletion is:");
  for(i=0;i<n-1;i++)
  {
    printf("\n%d",a[i]);
  }
  
        
}