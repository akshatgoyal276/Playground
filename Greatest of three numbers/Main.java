#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if(a>b && a>c)
  {
    printf("%d is greater",a);
  }
  else if(b>c)
  {
    printf("%d is greater",b);
  }
  else
  {
    printf("%d is greater",c);
  }  
}