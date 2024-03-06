// [7,15,9,17,36,54]
// [9,17,17,36,54,-1]
#include<stdio.h>

void main(){
    int arr[] = {7,15,9,17,36,54};
    int length = sizeof(arr) / sizeof(arr[0]);
    int index = 0;
    int firstele = arr[index];
    int min = 0;
    for (int i = 1; i < length; i++){
        for(int j = i+1 ; j<length;j++){
            firstele = arr[index];
            if(arr[i]>arr[j] && firstele < arr[i]){
                min = arr[j];
                arr[index] = min;
                min=0;
                index++;
            }
        }
    }
    for(int x =0;x<length;x++){
        printf("%d ", arr[x]);
    }
}