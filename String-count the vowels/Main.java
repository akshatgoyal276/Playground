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
    if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
      count++;
  }
  printf("Number of vowels: %d",count);
}