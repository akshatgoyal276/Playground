#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],temp[n+1],i,j;
  for(i=0;i<n;i++)
  {
    scanf("\n%d",&a[i]);
    temp[i]=a[i];
  }
  temp[n+1]=0;
  int n1,x;
  scanf("\n%d\%d",&n1,&x);
  for(j=n1-1;j<n;j++)
  {
    temp[j+1]=a[j];
  }
  temp[n1-1]=x;
  
  printf("Array after insertion is:");
  for(i=0;i<n+1;i++)
  {
    printf("\n%d",temp[i]);
  }
  
        
}