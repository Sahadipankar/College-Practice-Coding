#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node in the BST
struct Node
{
    int data;
    struct Node *left, *right;
};

// Function to create a new node
struct Node *createNode(int data)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to insert a node in the BST
struct Node *insert(struct Node *node, int data)
{
    if (node == NULL)
    {
        return createNode(data);
    }

    if (data < node->data)
    {
        node->left = insert(node->left, data);
    }
    else if (data > node->data)
    {
        node->right = insert(node->right, data);
    }

    return node;
}

void preorderTraversal(struct Node *root)
{
    if (root != NULL)
    {
        printf("%d ", root->data);
        preorderTraversal(root->left);
        preorderTraversal(root->right);
    }
}

    // Function to perform Inorder traversal
    void inorderTraversal(struct Node *root)
{
    if (root != NULL)
    {
        inorderTraversal(root->left);
        printf("%d ", root->data);
        inorderTraversal(root->right);
    }
}

// Function to perform Postorder traversal
void postorderTraversal(struct Node *root)
{
    if (root != NULL)
    {
        postorderTraversal(root->left);
        postorderTraversal(root->right);
        printf("%d ", root->data);
    }
}

// Main function
int main()
{
    struct Node *root = NULL;
    int n, value;

    printf("Enter the number of nodes: ");
    scanf("%d", &n);

    printf("Enter the values: \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &value);
        root = insert(root, value);
    }

    printf("Preorder Traversal: ");
    preorderTraversal(root);
    printf("\n");

    printf("Inorder Traversal: ");
    inorderTraversal(root);
    printf("\n");

    printf("Postorder Traversal: ");
    postorderTraversal(root);
    printf("\n");

    return 0;
}
