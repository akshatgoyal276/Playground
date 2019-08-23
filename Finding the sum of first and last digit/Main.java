#include <stdio.h>
int main() {
	int num,last,sum ;
    scanf("%d", &num);
 
    last = num%10;
    while(num>=10)
    {
        num = num/10;
    }
  sum=last+num;
    printf("%d",sum);
	return 0;
}