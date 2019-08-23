#include<stdio.h>
int main()
{
  int len,i;
  char str[20];
  for(i=0;i<20;i++)
  {
    scanf("%c",&str[i]);
  }
  len=strlen(str);
  printf("%d",len);
}