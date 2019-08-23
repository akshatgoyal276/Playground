#include<stdio.h>
int main()
{
  int a,n,i;
  scanf("%d\n%d",&a,&n);
  for(i=1;i<=n;i++)
  {
    printf("%d * %d = %d\n",a,i,a*i);
  }
  
}