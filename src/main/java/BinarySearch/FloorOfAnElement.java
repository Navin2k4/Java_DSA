// ? Floor of a number 
// ? We can use the binary search to solve the problem  
// ! STATEMENT : We should find the Greatest element <= target

package BinarySearch;
public class FloorOfAnElement {
    public static void main(String[] args) {
        int array[] = { 2, 3, 5, 9, 14, 16, 18 };
        int ans = FloorIndex(array, 15);
        System.out.println(ans);
    }

    static int FloorIndex(int arr[], int target) {

        // What if the target element greater than the greatest element
        if (target < arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end; // ! Statement Changed from ( return -1 ) to ( return end ) the Normal Binary search
    }
}
