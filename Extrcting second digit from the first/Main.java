#include <stdio.h>
int main() 
{
  int i;
  scanf("%d",&i);
  while(i>=100)
    {
        i = i/10;
    }
  i=i%10;
 
  printf("%d",i);
  return 0;
}