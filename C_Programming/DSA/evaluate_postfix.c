#include <stdio.h>
#include <string.h>
int main()
{
    int stack[15];
    int i;
    int top = -1;
    char expression[] = "532*+82/-";
    int len = strlen(expression);
    int operand1, operand2, result, final_result;
    for (i = 0; i < len; i++)
    {
        char c = expression[i];
        if (c >= '0' && c <= '9')
        {
            top++;
            stack[top] = c - '0'; // to convert from character to integer using ASCII value
        }
        else if (c == '+' || c == '-' || c == '*' || c == '/')
        {
            operand1 = stack[top];
            top--;
            operand2 = stack[top];
            top--;
            switch (c)
            {
            case '+':
                result = operand2 + operand1;
                break;
            case '-':
                result = operand2 - operand1;
                break;
            case '*':
                result = operand2 * operand1;
                break;
            case '/':
                result = operand2 / operand1;
                break;
            }
            top++;
            stack[top] = result;
        }
    }
    final_result = stack[top];
    top--;
    printf("Result= %d", final_result);
    return 0;
}
