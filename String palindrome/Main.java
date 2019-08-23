#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[100];
  for(int i=0;i<100;i++)
  {
    scanf("%c",&a[i]);
  }
  int count=0;
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]==a[strlen(a)-i-1])
      count=1; 
    else
      count=0;
  }
  if(count==1)
    printf("Palindrome");
  else
    printf("Not a Palindrome");
}