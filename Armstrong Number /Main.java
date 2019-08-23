#include <stdio.h>
int main() {
	int i,sum;
  scanf("%d",&i);
  sum=((i%10)*(i%10)*(i%10))+(((i/10)%10)*((i/10)%10)*((i/10)%10))+((i/100)*(i/100)*(i/100));;
  if(sum==i)
    printf("Armstrong Number");
  else
   printf("Not an Armstrong Number");
	return 0;
}