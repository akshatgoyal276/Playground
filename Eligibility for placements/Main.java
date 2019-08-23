#include<stdio.h>
int main()
{
  char a[10],b[10];
  float c;
  int d;
  scanf("%s\n%s\n%f\n%d",&a,&b,&c,&d);
  if(c>=7.5)
  {
    if(d<=2)
      printf("%s\n%s\nEligible to attend placement",a,b);
    else
      printf("%s\n%s\nNot Eligible to attend placement",a,b);
  }
  else if(c>=7.0 && c<7.5 && d==0)
    printf("%s\n%s\nEligible to attend placement",a,b);
  else
    printf("%s\n%s\nNot Eligible to attend placement",a,b);
}