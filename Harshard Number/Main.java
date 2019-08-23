#include<stdio.h>
int main()
{
  int n,s,d;
  scanf("%d",&n);
  s=(n%10)+((n/10)%10)+((n/100)%10)+((n/1000)%10);
  d=n%s;
  if(d==0)
    printf("Harshard Number");
  else
    printf("Not Harshard Number");
}