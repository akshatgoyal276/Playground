#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],i,o=0,e=0;
  for(i=0;i<n;i++)
  {
    scanf("\n%d",&a[i]);
    if((a[i]%2)==0)
      e++;
    else
      o++;
  }
  printf("Odd: %d\nEven: %d",o,e); 
}