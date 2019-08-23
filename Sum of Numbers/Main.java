#include<stdio.h>
int main()
{
  signed int a[10],c=0,i=0;
    scanf("%d\n",&a[0]);
    while(a[i]!=-1)
    {
      c=c+a[i];
      i++;
      scanf("%d\n",&a[i]);
    }
  printf("%d",c);
  
}