#include<stdio.h>
int main()
{
  char a[100];
  gets(a);
  printf("The length of %s is %d",a,strlen(a));
}