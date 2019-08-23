#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d\n%d\n",&n,&m);
  int a1[n][m],i,j,temp[n];
  for(i=0;i<n;i++)
  {
     temp[n]=0;
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      scanf("%d\n",&a1[i][j]);
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(a1[i][j]>temp[i])
        temp[i]=a1[i][j];
    }
  }
  
  for(i=0;i<n;i++)
  {
     printf("%d\n",temp[i]);
  }
}