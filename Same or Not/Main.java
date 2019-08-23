#include<stdio.h>
int main()
{
  int n1;
  scanf("%d",&n1);
  int a[n1],i1,temp1=0;
  for(i1=0;i1<n1;i1++)
  {
    scanf("\n%d",&a[i1]);
    temp1=temp1+a[i1];
  }
  int n2;
  scanf("%d",&n2);
  int a2[n2],i2,temp2=0;
  for(i2=0;i2<n2;i2++)
  {
    scanf("\n%d",&a2[i2]);
    temp2=temp2+a2[i2];
  }
  if(n1==n2 && temp1==temp2)
    printf("Same");
  else
    printf("Not Same");
 
  
}