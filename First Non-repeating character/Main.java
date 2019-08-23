#include<stdio.h>
int main()
{
  char a[50];
  gets(a);
  for(int i=0;i<strlen(a);i++)
  {
    int count=0;
    for(int j=0;j<strlen(a);j++)
    {
      if(a[i]==a[j])
      {
        count++;
      }
    }
    if(count==1)
    {
    printf("%c",a[i]);
      break;
    }
  }
}