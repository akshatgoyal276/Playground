#include <stdio.h>
struct student
{
    int rn,s1,s2,s3,s4,s5,grade;
    float avg;
};
void main()
{
  int n;
  scanf("%d",&n);
  struct student s[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d\n%d\n%d\n%d\n%d\n%d\n",&s[i].rn,&s[i].s1,&s[i].s2,&s[i].s3,&s[i].s4,&s[i].s5);
    s[i].avg=(s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5)/5;
    if(s[i].avg>70)
      s[i].grade=1;
    else if(s[i].avg>50)
      s[i].grade=2;
    else
      s[i].grade=3;
  }
  printf("STUDENT MARKSHEET USING STRUCTURES\nEnter the no of students\n\nrn s1 s2 s3 s4 s5 avg grade\n\n");
  for(int i=0;i<n;i++)
  {
    printf("%d %d %d %d %d %d %.2f %d\n",s[i].rn,s[i].s1,s[i].s2,s[i].s3,s[i].s4,s[i].s5,s[i].avg,s[i].grade);
  }
}