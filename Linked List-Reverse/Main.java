// Iterative C program to reverse a linked list 
#include <stdio.h> 
#include <stdlib.h> 

/* Link list node */
struct Node { 
	int data; 
	struct Node* next; 
}; 

/* Function to reverse the linked list */
static void reverse(struct Node** head_ref) 
{ 
	struct Node* prev = NULL; 
	struct Node* current = *head_ref; 
	struct Node* next = NULL; 
	while (current != NULL) { 
		// Store next 
		next = current->next; 

		// Reverse current node's pointer 
		current->next = prev; 

		// Move pointers one position ahead. 
		prev = current; 
		current = next; 
	} 
	*head_ref = prev; 
} 

/* Function to push a node */
void push(struct Node** head_ref, int new_data) 
{ 
	struct Node* new_node = (struct Node*)malloc(sizeof(struct Node)); 
	new_node->data = new_data; 
	new_node->next = (*head_ref); 
	(*head_ref) = new_node; 
} 

/* Function to print linked list */
void printList(struct Node* head) 
{ 
	struct Node* temp = head; 
	while (temp != NULL) { 
		printf("%d ", temp->data); 
		temp = temp->next; 
	} 
} 

/* Driver program to test above function*/
int main() 
{ 
	/* Start with the empty list */
	struct Node* head = NULL;
  int x;
  while(x!=-1)
  {
    scanf("%d/n",&x);
    if(x!=-1)
      push(&head,x);
  }

	printf("The students are seated in the order: "); 
  reverse(&head);
	printList(head); 
	 
	printf("\nAfter reversing the students are seated in the order: ");
  reverse(&head);
	printList(head); 
} 
