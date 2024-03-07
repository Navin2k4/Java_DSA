package SelectionSort;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int us_arr[] = { 4, 5, 1, 2, 3 };
        Selectionsort(us_arr);
        System.out.println(Arrays.toString(us_arr));
    }

    static void Selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the remaining array and swap with correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
