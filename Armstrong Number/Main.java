#include<stdio.h>
int main()
{
  int n,sop;
  scanf("%d",&n);
  sop=(pow((n%10),3))+(pow((n/10)%10,3))+(pow((n/100),3));
  if(sop==n)
    printf("Armstrong Number");
  else
    printf("Not Armstrong Number");
}