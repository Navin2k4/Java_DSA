// ? https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
/*
 * Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
 ! Source: Amazon Interview Experience. 
   ? How can you code an infinite array ? => 
   ? By mimic - we are just imagining as infinite so that we cannot use the arr.length here
   ? By Array Reader Class
*/
package BinarySearch;
public class FindThePositionOfAnElementInAnSortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {
    int[] arr = {3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};        
    int target = 90; // !After 90 it throws error for a finite array size
    System.out.println(ans(arr, target));
    }
    static int ans(int[] arr,int target){
        // Find the range
        // first start with a box of size 2;
        int start = 0;
        int end = 1;
        // condition or the target to lie in the range is => the value is before the end or not ?
        // keep doubling it
        
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;

            // ! Since we are considering the range as infinity the value if the end in the
            // ! 3rd iteraton goes to 13 and here it is out of bound and error is thrown

        }
            
        return InfiniteArrayIndex(arr, target, start, end);
    }
    static int InfiniteArrayIndex(int arr[], int target,int start,int end) {
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
        return -1;
    }
}