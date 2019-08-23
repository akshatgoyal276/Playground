#include<stdio.h>
int main()
{
  int i,count=0;
  char a[20],temp;
  for(i=0;i<20;i++)
  {
    scanf("%c",&a[i]);
  }
  temp=a[0];
  for(i=0;i<=strlen(a);i++)
  {
    if(strlen(a)==20)
    {
    printf("Invalid Input");
    break;
    }
    else if(a[i]==temp)
    {
      count+=1;
    }
    else
    {
      printf("%c%d",temp,count);
      count=1;
      temp=a[i];
    }
  }
    
}