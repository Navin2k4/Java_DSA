// #include <stdio.h>
// #include <stdlib.h>

// int* intersection(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
//     int maxSize = nums1Size < nums2Size ? nums1Size : nums2Size; 
//     int *result =(int *)malloc(sizeof(int) * maxSize); 
//     int index = 0;
//     for (int i=0; i<nums1Size; i++) {
//         for (int j=0; j< nums2Size; j++) {
//             if (nums1[i] == nums2[j]) {
//                 int found = 0;
//                 for (int k=0; k<index; k++) {
//                     if (result[k] == nums1[i]) {
//                         found = 1;
//                         break;
//                     }
//                 }
//                 if (!found) 
//                 {
//                     result[index++] = nums1[i];
//                 }
//                 break;             
//             }
//         }
//     }
//     *returnSize = index;
//     return result;
//     free(result); 
// }
