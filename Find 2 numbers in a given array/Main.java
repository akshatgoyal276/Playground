#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,f1,f2,temp1=1,temp2=1;
  for(i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  }
  scanf("%d %d",&f1,&f2);
  for(i=0;i<n;i++)
  {
    if(a[i]==f1)
    {
      printf("Element 1 index = %d",i);
      break;
    }
    temp1++;
  }
  if(temp1==n+1)
  {
    printf("Element 1 index = -1");
  } 
  for(i=0;i<n;i++)
  {
    if(a[i]==f2)
    {
      printf("\nElement 2 index = %d",i);
      break;
    }
    temp2++;
  }
  if(temp2==n+1)
  {
    printf("\nElement 2 index = -1");
  } 
  
}