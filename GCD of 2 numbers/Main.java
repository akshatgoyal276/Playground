// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int a,b,i,small;
  scanf("%d\n%d",&a,&b);
  small=a>b?b:a;
  for(i=small;i>0;i--)
  {
    if(a%i==0 && b%i==0)
    {
      printf("%d",i);
      break;
    }
  }
}