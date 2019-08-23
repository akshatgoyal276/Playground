#include<stdio.h>
int main()
{
  char a[100];
  int v=0,c=0,w=0,d=0,s=0;
  gets(a);
  for(int i=0;i<strlen(a);i++)
  {
    if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
    {
      v++;
    }
    else if(a[i]==32)
      w++;
    else if(a[i]>=48 && a[i]<=57)
      d++;
    else
      c++;
  }
  printf("Vowels:%d\nConsonants:%d\nWhite Spaces:%d\nDigits:%d\nSymbols:%d",v,c,w,d,s);
      
}