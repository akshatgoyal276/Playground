#include<stdio.h>

int main()
{
  int i,j=0;
  char a[100];
  for(i=0;i<100;i++)
  {
    scanf("%c",&a[i]);
  }
  for(i=0;i<strlen(a);i++)
  {
    if(a[i]==32)
    {
      j=j+1;
    }
  }
  printf("%d",j+1);
  
}