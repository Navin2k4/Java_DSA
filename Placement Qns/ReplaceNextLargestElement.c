// [7,15,9,17,36,54]
// [9,17,17,36,54,-1]
#include<stdio.h>

void main(){
    int arr[] = {7,15,9,17,36,54};
    int length = sizeof(arr) / sizeof(arr[0]);
    int index = 0;
    int firstele = arr[index];
    int min = 0;
    for (int i = 0; i < length; i++){
        int nextVal = arr[i+1];
            if(arr[i]>=nextVal && firstele <= nextVal){
                min = nextVal;
                arr[index] = min;
                index++;
                firstele = arr[index];
        }
    }
    for(int x =0;x<length;x++){
        printf("%d ", arr[x]);
    }
}