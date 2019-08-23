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
void remove_duplicate_elements(struct a *temp)
{
struct a *ptr1, *ptr2, *duplicate;
ptr1 = temp;

while (ptr1 != NULL && ptr1->b != NULL)
{
ptr2 = ptr1;

/* Compare the current element with rest of the elements */
while (ptr2->b != NULL)
{
if (ptr1->d == ptr2->b->d)
{
duplicate = ptr2->b;
ptr2->b = ptr2->b->b;
}
else
ptr2 = ptr2->b;
}
ptr1 = ptr1->b;
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
    }
  }
  remove_duplicate_elements(head);
  printf("The assigned roll numbers are: ");
  printList(head);
}