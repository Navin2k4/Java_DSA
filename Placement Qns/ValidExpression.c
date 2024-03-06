#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#define MAX_LEN 20
bool isValidExpression(const char *string, int start, int end){
    int stack[MAX_LEN];
    int top = -1;
    for (int i = start; i <= end; i++){
        if (string[i] == '('){
            if (top == MAX_LEN - 1) 
                return false;
            stack[++top] = i;
        }
        else if (string[i] == ')')
        {
            if (top == -1) 
                return false;
            top--;
        }
    }
    return top == -1;
}

bool isSimpleExpression(char c){
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
}

bool isValidSimpleExpression(const char *string, int start, int end){
    for (int i = start; i <= end; i++){
        if (!isSimpleExpression(string[i]))
                return false;
    }
    return true;
}

bool isValid(const char *string){
    int len = strlen(string);
    if (string[0] != '(' || string[len - 1] != ')')
        return false;
    return isValidExpression(string, 1, len - 2) && isValidSimpleExpression(string, 1, len - 2);
}

int main(){
    char string[MAX_LEN];
    printf("Enter the expression : ");
    scanf("%s", string);

    if (isValid(string)){
        printf("Valid\n");
    }
    else{
        printf("Invalid\n");
    }

    return 0;
}
