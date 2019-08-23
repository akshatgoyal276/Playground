#include<stdio.h>
int main()
{
  int n1;
  scanf("%d",&n1);
  int a1[n1],i1;
  for(i1=0;i1<n1;i1++)
  {
    scanf("\n%d",&a1[i1]);
  }
  int n2=n1;
  int a2[n2],i2;
  for(i2=0;i2<n2;i2++)
  {
    scanf("\n%d",&a2[i2]);
  }
  int a3[n1],i3;
  for(int i3=0;i3<n2;i3++)
  {
    a3[i3]=a1[i3]+a2[i3];
    printf("%d ",a3[i3]);
  }
  
  
}