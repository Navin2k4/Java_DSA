// (a+b),(a*b) = > valid
// (ab*) => invalid
#include<stdio.h>
#include<stdbool.h>
void main(){
    char string[20];
    printf("Enter the expression : ");
    scanf("%s",&string);
    for(int i=0;string[i]!='\0';i++){
        if (string[i] >= 97 && string[i] <= 122 || string[i] >= 65 && string[i] <= 90)
        {
            
        }
    }

    printf("%s",string);
}
