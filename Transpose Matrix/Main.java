#include<stdio.h>
int main()
{
  int n,m;
  scanf("%d\n",&n);
  m=n;
  int a1[n][m],i,j;
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
      printf("%d ",a1[i][j]);
    }
    printf("\n");
  }
  printf("Transpose matrix is :\n");
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      printf("%d ",a1[j][i]);
    }
    printf("\n");
  }
}