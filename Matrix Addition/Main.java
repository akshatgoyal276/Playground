#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d\n%d",&n,&m);
  int a1[n][m],a2[n][m],a3[n][m],i,j;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      scanf("\n%d",&a1[i][j]);
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      scanf("\n%d",&a2[i][j]);
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      a3[i][j]=a1[i][j]+a2[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      printf("%d ",a3[i][j]);
    }
    printf("\n");         
  }
  
}