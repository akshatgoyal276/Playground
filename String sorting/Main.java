#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  gets(a);
  for(int i=0;i<strlen(a)-1;i++)
  {
    for(int j=0;j<strlen(a)-1;j++)
    {
      if(a[j]>a[j+1])
      {
        char temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
      }
    }
  }
  printf("The sorted string is ");
  puts(a);
  
  
}