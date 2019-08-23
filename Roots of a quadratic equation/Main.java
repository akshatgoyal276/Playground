#include<stdio.h>
int main()
{
  float a,b,c,j,r1,r2,k,img;
  scanf("%f\n%f\n%f",&a,&b,&c);
  j=(b*b)-(4*a*c);
  if(j>0)
  {
    k=sqrt(j);
    r1=(-b+k)/(2*a);
    r2=(-b-k)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(j==0)
  {
    r1=r2=(-b/(2*a));
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else
  {
    k=sqrt(-j);
    r1=(-b/(2*a));
    img=k/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",r1,img,r1,img);
  }
  
}