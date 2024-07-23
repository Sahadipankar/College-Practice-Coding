#include <stdio.h>
#include <stdlib.h>

// Define the structure of a node in the linked list
struct node
{
    int data;          // Data part of the node
    struct node *next; // Pointer to the next node in the list
};

struct node *head = NULL; // Initialize the head of the linked list to NULL

// Function declarations
void append();
int length();
void display();
void addatbegin();
void addatafter();
void deleteNode();

int main()
{
    int ch; // Variable to store the user's choice
    printf("Operations of Single Linked List.\n");
    while (1) // Infinite loop to keep the program running until user chooses to exit
    {
        // Display menu options
        printf("\n1. Append\n");
        printf("2. Add at Begin\n");
        printf("3. Add at After\n");
        printf("4. Length of Linked List\n");
        printf("5. Display Items\n");
        printf("6. Delete items\n");
        printf("7. Exit\n");

        printf("\nEnter your choice: ");
        scanf("%d", &ch); // Read the user's choice

        switch (ch) // Execute the appropriate function based on user's choice
        {
        case 1:
            append(); // Append a new node to the end of the list
            break;
        case 2:
            addatbegin(); // Add a new node at the beginning of the list
            break;
        case 3:
            addatafter(); // Add a new node after a specified position
            break;
        case 4:
            printf("\n\nThe Length of the Linked List is: %d\n\n", length()); // Print the length of the list
            break;
        case 5:
            display(); // Display all nodes in the list
            break;
        case 6:
            deleteNode(); // Delete a node from the list
            break;
        case 7:
            printf("\n\n*** Thank You ***\n\n\n"); // Thank the user and exit
            return 0;                              // Correct use of return to exit main
        default:
            printf("\nInvalid choice. Please try again.\n"); // Handle invalid menu choices
            break;
        }
    }
}

// Function to append a new node to the end of the list
void append()
{
    struct node *new, *temp;                          // Declare pointers for new node and temporary traversal
    new = (struct node *)malloc(sizeof(struct node)); // Allocate memory for the new node

    printf("\nEnter the node data: ");
    scanf("%d", &new->data); // Read the data for the new node
    new->next = NULL;        // New node will be the last node, so next is NULL

    if (head == NULL) // If the list is empty
    {
        head = new; // New node is now the head
    }
    else
    {
        temp = head;               // Start from the head
        while (temp->next != NULL) // Traverse to the end of the list
        {
            temp = temp->next;
        }
        temp->next = new; // Link the last node to the new node
    }
    printf("\nNode is inserted.\n"); // Confirm insertion
}

// Function to return the length of the linked list
int length()
{
    int count = 0;            // Counter to keep track of the number of nodes
    struct node *temp = head; // Start from the head

    while (temp != NULL) // Traverse the list until the end
    {
        count++;           // Increment counter
        temp = temp->next; // Move to the next node
    }
    return count; // Return the length
}

// Function to display all nodes in the list
void display()
{
    struct node *temp = head; // Start from the head

    if (temp == NULL) // If the list is empty
    {
        printf("\nList is empty.\n"); // Inform the user
    }
    else
    {
        int i = 1;           // Position counter
        while (temp != NULL) // Traverse the list
        {
            printf("\nThe element %d in the List is: ", i); // Print position
            printf("%d ", temp->data);                      // Print data
            temp = temp->next;                              // Move to the next node
            i++;                                            // Increment position counter
        }
        printf("\n"); // Print a newline for formatting
    }
}

// Function to add a node at the beginning of the list
void addatbegin()
{
    struct node *new;
    new = (struct node *)malloc(sizeof(struct node)); // Allocate memory for the new node

    printf("\nEnter the node data: ");
    scanf("%d", &new->data); // Read the data for the new node

    new->next = head; // Link the new node to the current head
    head = new;       // Update head to the new node

    printf("\nNode is inserted at the beginning.\n"); // Confirm insertion
}

// Function to add a node after a specified position
void addatafter()
{
    int loc, i = 1; // Position variable and counter
    struct node *new, *temp;

    printf("\nEnter the location after which you want to add: ");
    scanf("%d", &loc); // Read the position

    if (loc > length() || loc < 1) // Validate the position
    {
        printf("\nInvalid location.\n");
        printf("\nCurrently list is having %d elements.\n", length()); // Inform the user of the valid range
    }
    else
    {
        temp = head;    // Start from the head
        while (i < loc) // Traverse to the specified position
        {
            temp = temp->next;
            i++;
        }

        new = (struct node *)malloc(sizeof(struct node)); // Allocate memory for the new node
        printf("\nEnter the node data: ");
        scanf("%d", &new->data); // Read the data for the new node

        new->next = temp->next; // Link the new node to the next node
        temp->next = new;       // Link the previous node to the new node

        printf("\nNode is inserted after element %d\n", loc); // Confirm insertion
    }
}

// Function to delete a node at a specified position
void deleteNode()
{
    int loc; // Position variable
    printf("\nEnter the location of the node to delete: ");
    scanf("%d", &loc); // Read the position

    if (loc > length() || loc < 1) // Validate the position
    {
        printf("\nInvalid location. Please try again.\n");
    }
    else
    {
        struct node *temp = head; // Start from the head

        if (loc == 1) // If the node to be deleted is the head
        {
            head = temp->next; // Update the head to the next node
            free(temp);        // Free the memory of the old head
        }
        else
        {
            struct node *q; // Pointer to hold the node to be deleted
            int i = 1;
            while (i < loc - 1) // Traverse to the node before the one to be deleted
            {
                temp = temp->next;
                i++;
            }
            q = temp->next;       // Node to be deleted
            temp->next = q->next; // Link the previous node to the next node
            free(q);              // Free the memory of the deleted node
        }
        printf("\nNode is deleted.\n"); // Confirm deletion
    }
}
