#include <stdio.h>
#include <string.h>
struct employee
{
  char name[100],desig[100];
  int id,age,salary;
};
int main()
{
  struct employee s1;
  scanf("%s\n%d\n%d\n%s\n%d",&s1.name,&s1.id,&s1.age,&s1.desig,&s1.salary);
  printf("Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:");
  printf("\nEmployee Details\nName of the Employee:%s\nID of the Employee:%d\nAge of the Employee:%d\nDesignation of the employee:%s\nSalary of the Employee:%d",s1.name,s1.id,s1.age,s1.desig,s1.salary);
}