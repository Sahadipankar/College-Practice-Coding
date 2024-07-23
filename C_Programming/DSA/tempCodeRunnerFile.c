#include <stdio.h>
#include <stdlib.h>

struct student
{
    int marks; // 4 bytes storage
    struct student *next; // 4 bytes storage as per highest data type int
}; // 8 bytes storage
int main()
{
    struct student *head = NULL; // Storing address of first node HEAD
    int ch;
    while (1)
    {
        printf("\n1.Add item\n");
        printf("2.Display items\n");
        printf("3.Delete item\n");
        printf("4.Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);
        if (ch == 1)
        {
            struct student *new, *temp; // new and temp are pointers of type struct student
            new = (struct student *)malloc(sizeof(struct student)); // 8 bytes storage memory allocation for new node stored in new
            printf("\nEnter marks: ");
            scanf("%d", &new->marks);
            new->next = NULL;

            if (head == NULL)
            {
                head = new;
            }
            else
            {
                temp = head;
                while (temp->next != NULL)
                {
                    temp = temp->next;
                }
                temp->next = new;
            }
            printf("\nMarks is inserted\n");
        }
        else if (ch == 2)
        {
            struct student *p = head;
            printf("\nThe marks are:\n");
            while (p != NULL)
            {
                printf("%d ", p->marks);
                p = p->next;
            }
            printf("\n");
        }
        else if (ch == 3)
        {
            int key;
            printf("\nEnter the no. that you want to delete: ");
            scanf("%d", &key);
            struct student *x = head, *y;
            if (x == NULL)
            {
                printf("\nEmpty linked list.");
            }
            else
                y = x;
            int count = 0;
            while (x != NULL)
            {
                count++;
                if (key == x->marks)
                {
                    if (count == 1)
                    {
                        // first element
                        head = x->next;
                    }
                    else
                    {
                        // any element
                        y->next = x->next;
                    }
                }
                y = x;
                x = x->next;
            }
            printf("\nMarks is Deleted\n");
        }
        else
        {
            printf("\nThank you");
            break;
        }
    }
    return 0;
}