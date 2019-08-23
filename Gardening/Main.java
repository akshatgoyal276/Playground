#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if((c/a)==(b-1) || (c/a)==1)
    printf("It is a mango tree");
  else
    printf("It is not a mango tree");
  
}