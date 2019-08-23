#include<stdio.h>
#include<stdlib.h>

struct a
{
  int d;
  struct a *b;
};

void push(struct a **head,int nd)
{
  struct a *new_b = (struct a*)malloc(sizeof(struct a));
  new_b->d =nd;
  new_b->b=(*head);
  (*head)=new_b;
}

void append(struct a **head,int nd)
{
  struct a *new_b=(struct a*)malloc(sizeof(struct a));
  struct a *last=*head;
  new_b->d  = nd; 
  new_b->b = NULL; 
  if (*head == NULL) 
  { 
     *head=new_b; 
      return; 
  }   
  while (last->b != NULL) 
    last = last->b; 
 last->b = new_b;
 
 return;     
} 
void printList(struct a *b) 
{ 
  while (b != NULL) 
  { 
     printf("%d ", b->d); 
     b = b->b; 
  } 
}

void main()
{
  struct a *head = NULL;
  int x,count=0;
  while(x!=-1)
  {
    scanf("%d\n",&x);
    if(x!=-1)
    {
    append(&head,x);
    count++;
    }
  }
  printf("The students who are present in the class are\n");
  printList(head);
  printf("\nThe number of students who are present is %d.",count);
}