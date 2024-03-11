package CyclicSort;

import java.util.Arrays;


// ! This algorithm only works when the numbers sra in from 1 to N for a given array 
// ! Example : N = 5 , arr[] = { 3, 2, 4, 1, 5 }
 
public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 4 };
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}