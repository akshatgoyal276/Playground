#include<stdio.h>
int main()
{
  int a,b,i,small;
  scanf("%d\n%d",&a,&b);
  small=a>b?b:a;
  for(i=small;i>0;i++)
  {
    if(i%a==0 && i%b==0)
    {
      printf("%d",i);
      break;
    }
  }
}