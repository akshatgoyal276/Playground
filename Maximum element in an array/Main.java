#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  float a[n],temp;
  int i;
  for(i=0;i<n;i++)
  {
    scanf("%f",&a[i]);
  }
  temp=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>=temp)
    {
      temp=a[i];
    }
  }
  printf("%f",temp);
  
}