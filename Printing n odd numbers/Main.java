#include <stdio.h>
int main() {
	int i,j;
  scanf("%d",&j);
  for(i=1;i<2*j;i++)
    if(i%2==1)
    printf("%d\n",i);
}