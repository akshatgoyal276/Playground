#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[100];
  gets(a);
  gets(b);
  if(strcmp(b,a)==0)
    printf("Strings are same"); 
}