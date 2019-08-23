#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[100];
  for(int i=0;i<100;i++)
  {
    scanf("%c",&a[i]);
  }
  for(int i=0;i<strlen(a);i++)
  {
    b[i]=a[i]-32;
  }
  printf("String in uppercase is ");
  for(int i=0;i<strlen(a);i++)
  {
    printf("%c",b[i]);
  }
}