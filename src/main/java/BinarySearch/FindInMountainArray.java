// ! https://leetcode.com/problems/find-in-mountain-array/description/
// * 1095 (HARD)
/*
? Input: array = [1,2,3,4,5,3,1], target = 3
? Output: 2
? Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 */
package BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int nums[] = { 1,2,3,4,5,3,1 };
        int target = 3;
        System.out.println(search(nums,target));
    }

    static int search(int[] arr,int target){
        // Try to search in the first half 
        int peak = peakIndexInMountainArray(arr);
        int firsttry = OrderAgnosticBS(arr, target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        // Try to search in second half
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            if( arr[mid] > arr[mid+1] ){
                end = mid;
            }
            else{
                start = mid + 1; 
            }
            return start;
        }
        return -1;
    }
    
    static int OrderAgnosticBS(int arr[], int target,int start , int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1; 
                else
                    start = mid + 1; 
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1; 
            }
        }
        return -1;
    }
}






/*
 * /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */



// Solution modified for Leetcode
/*
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = peakIndexInMountainArray(arr);
        int firsttry = OrderAgnosticBS(arr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        // Try to search in second half
        return OrderAgnosticBS(arr, target, peak + 1, arr.length() - 1);
    }

    static int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
            return start;
        }
        return -1;
    }

    static int OrderAgnosticBS(MountainArray arr, int target, int start, int end) {

        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);
            if (midVal == target) 
                return mid;
            if (isAsc) {
                if (target < arr.get(mid))
                    end = mid - 1; 
                else
                    start = mid + 1; 
            } else {
                if (target > arr.get(mid))
                    end = mid - 1;
                else
                    start = mid + 1; 
            }
        }
        return -1;
    }
}
 */