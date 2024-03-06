// [2 3 5 6 7]
// [2 3 4]
// Result : [ 2 3 4 5 6 7 ]
#include <stdio.h>
int main()
{
    int arr1[] = {2, 3, 5, 6, 7};
    int arr2[] = {2, 3, 4};
    int length1 = sizeof(arr1) / sizeof(arr1[0]);
    int length2 = sizeof(arr2) / sizeof(arr2[0]);
    int arr3[length1 + length2];
    int size = 0 , i =0 ,j =0;

    while(i<length1 && j<length2){
        if(arr1[i]<arr2[j])
            arr3[size++]=arr1[i++];
        else if (arr2[j]<arr1[i])
            arr3[size++] = arr2[j++];
        else{
            arr3[size++] = arr1[i++];
            j++;
        }
    }
    
    while (i < length1)
        arr3[size++] = arr1[i++];

    while (j < length2)
        arr3[size++] = arr2[j++];

    for (int c = 0; c < size; c++)
        printf("%d ", arr3[c]);

    return 0;
}
