#include<stdio.h>
#include<math.h>
int main()
{
  int n,i,c=2,a=2;
  scanf("%d",&n);
  printf("%d",a);
  for(i=1;i<n;i++)
  {
    a=a+c;
    printf(" %d",a);
    c=c+pow(2,i-1);
  }
  
}