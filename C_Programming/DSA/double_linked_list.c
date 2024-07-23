#include <stdio.h>
#include <stdlib.h>

struct student
{
    int marks;
    struct student *next;
    struct student *prev;
};

int main()
{
    struct student *head = NULL;
    int ch;

    while (1)
    {
        printf("\n1. Add item\n");
        printf("2. Display items\n");
        printf("3. Reverse display\n");
        printf("4. Delete\n");
        printf("5. Exit\n");
        printf("\nEnter your choice: ");
        scanf("%d", &ch);

        if (ch == 1)
        {
            struct student *new, *temp;
            new = (struct student *)malloc(sizeof(struct student));
            printf("Enter marks: ");
            scanf("%d", &new->marks);
            new->next = NULL;
            new->prev = NULL;

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
                new->prev = temp;
            }
        }
        else if (ch == 2)
        {
            struct student *temp = head;
            printf("\nDisplaying items: ");
            while (temp != NULL)
            {
                printf("%d ", temp->marks);
                temp = temp->next;
            }
            printf("\n");
        }
        else if (ch == 3)
        {
            struct student *temp = head, *tail = NULL;
            if (head == NULL)
            {
                printf("List is empty.\n");
                continue;
            }
            while (temp->next != NULL)
            {
                temp = temp->next;
            }
            tail = temp;
            printf("\nReverse displaying items: ");
            while (tail != NULL)
            {
                printf("%d ", tail->marks);
                tail = tail->prev;
            }
            printf("\n");
        }
        else if (ch == 4)
        {
            printf("\nEnter the position of the item to be deleted: ");
            int pos;
            scanf("%d", &pos);
            if (head == NULL)
            {
                printf("List is empty. Cannot delete.\n");
                continue;
            }
            struct student *temp = head;
            if (pos == 1)
            {
                head = head->next;
                if (head != NULL)
                {
                    head->prev = NULL;
                }
                free(temp);
            }
            else
            {
                for (int i = 1; i < pos && temp != NULL; i++)
                {
                    temp = temp->next;
                }
                if (temp == NULL)
                {
                    printf("Position out of range.\n");
                }
                else
                {
                    if (temp->next != NULL)
                    {
                        temp->next->prev = temp->prev;
                    }
                    if (temp->prev != NULL)
                    {
                        temp->prev->next = temp->next;
                    }
                    free(temp);
                }
            }
        }
        else if (ch == 5)
        {
            break;
        }
        else
        {
            printf("\nInvalid choice! Please enter a valid choice.\n");
        }
    }

    return 0;
}
