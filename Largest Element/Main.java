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
  int largest(int *a,int b)
  {
    int temp=0;
    while(b!=0)
    {
      if(*a>temp)
      {
        temp=*a;
        b--;
        a++;
      }
      else
      {
        b--;
        a++;
      }
    }
    printf("%d",temp);
      
  }
  largest(&a[0],n);
  
  
}