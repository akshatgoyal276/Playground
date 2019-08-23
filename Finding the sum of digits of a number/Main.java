#include <stdio.h>
int main() 
{
   int sum,i;
   scanf("%d",&i);
   sum=(i%10)+((i/10)%10)+((i/100)%10)+((i/1000)%10)+((i/10000)%10)+((i/100000)%10);
   printf("%d",sum);
   return 0;
}