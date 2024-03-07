package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int us_arr[] = {1,-8,4,-3,5,4};
        Bubblesort(us_arr);
        System.out.println(Arrays.toString(us_arr));
    }

    static void Bubblesort(int arr[]){
        // Run the steps for n-i times
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // For the each step max itemm will come at the respective index
            for (int j = 1; j < arr.length-i; j++) {
                // Swap if the item is smaller than the previous item 
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true; // ? When the comparison take place and no 
                                    // ? swapping occours then it is sorted and hence breaking it from executing another i loop
                }
            }
            // If you did not swap a particular value of i it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
            }
        }
}
