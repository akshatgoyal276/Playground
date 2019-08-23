#include<stdio.h>
int main()
{
  char a;
  int b;
  scanf("%c",&a);
  b=a;
  if( a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ||
      a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
    printf("ASCII of %c is %d",a,b);
}