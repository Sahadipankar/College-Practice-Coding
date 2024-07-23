#include <stdio.h>
#include <stdlib.h>

struct student
{
    int marks;            // 4 bytes storage
    struct student *next; // 4 bytes storage
};

int main()
{
    struct student *head = NULL; // Storing address of first node HEAD
    int ch;

    while (1)
    {
        printf("\n1. Add item\n");
        printf("2. Display items\n");
        printf("3. Delete item\n");
        printf("4. Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        if (ch == 1)
        {
            struct student *new, *temp;                             // new and temp are pointers of type struct student
            new = (struct student *)malloc(sizeof(struct student)); // Allocate memory for new node
            printf("\nEnter marks: ");
            scanf("%d", &new->marks);
            new->next = NULL;

            if (head == NULL)
            {
                head = new;
                new->next = head; // Pointing to itself, circular
            }
            else
            {
                temp = head;
                while (temp->next != head)
                {
                    temp = temp->next;
                }
                temp->next = new;
                new->next = head; // Maintaining circular nature
            }
            printf("\nMarks are inserted\n");
        }
        else if (ch == 2)
        {
            if (head == NULL)
            {
                printf("\nThe list is empty.\n");
            }
            else
            {
                struct student *p = head;
                printf("\nThe marks are:\n");
                do
                {
                    printf("%d ", p->marks);
                    p = p->next;
                } while (p != head);
                printf("\n");
            }
        }
        else if (ch == 3)
        {
            int key;
            printf("\nEnter the marks you want to delete: ");
            scanf("%d", &key);

            if (head == NULL)
            {
                printf("\nThe list is empty. Cannot delete.\n");
            }
            else
            {
                struct student *x = head, *y = NULL;
                do
                {
                    if (x->marks == key)
                    {
                        if (x == head)
                        {
                            struct student *temp = head;
                            while (temp->next != head)
                            {
                                temp = temp->next;
                            }
                            if (head == head->next)
                            {
                                head = NULL; // The list is now empty
                            }
                            else
                            {
                                temp->next = head->next;
                                head = head->next;
                            }
                            free(x);
                        }
                        else
                        {
                            y->next = x->next;
                            free(x);
                        }
                        printf("\nMarks deleted\n");
                        break;
                    }
                    y = x;
                    x = x->next;
                } while (x != head);

                if (x == head && y->next != head)
                {
                    printf("\nMarks not found.\n");
                }
            }
        }
        else if (ch == 4)
        {
            printf("\nThank you\n");
            break;
        }
        else
        {
            printf("\nInvalid choice! Please enter a valid choice.\n");
        }
    }
    return 0;
}