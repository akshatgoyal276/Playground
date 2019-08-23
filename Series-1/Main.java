#include<stdio.h>
int main()
{
  int a,i,c=7;
  scanf("%d",&a);
  printf("%d",c);
  for(i=0;i<a-1;i++)
  {
    if(i%2==0)
    {
      c=c-2;
      printf(" %d",c);
    }
    else
    {
      c=c+3;
      printf(" %d",c);
    }
  }
    
    
  
}