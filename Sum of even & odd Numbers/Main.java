#include<stdio.h>
int main()
{
  signed int a[10],c1=0,c2=0,i=0;
  float b1=0.0 ,b2=0.0;
    scanf("%d\n",&a[0]);
    while(a[i]!=-1)
    {
      if(a[i]%2==0)
      {
        c2=c2+a[i];
        b2++;
        i++;
      }
      else
      {
        c1=c1+a[i];
        b1++;
        i++;
      }
      scanf("%d\n",&a[i]);
    }
  float avg1=c1/b1;
  float avg2=c2/b2;
  printf("%d\n%d\n%.2f\n%.2f",c2,c1,avg2,avg1);
  
}