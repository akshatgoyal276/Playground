#include<stdio.h>
int main()
{
  int t,v;
  float wcf;
  scanf("%d\n%d",&t,&v);
  wcf=35.74+(0.6215*t)+((0.4275*t)-35.75)*(pow(v,0.16));
  printf("%.2f",wcf);
  return 0;
}