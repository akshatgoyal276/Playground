#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  if(a<=200)
  {
    int b=a*0.5;
    printf("Rs.%d",b);
  }
  else if(200<a<=400)
  {
    int c=(a*0.65)+100+1;
    printf("Rs.%d",c);
  }
}