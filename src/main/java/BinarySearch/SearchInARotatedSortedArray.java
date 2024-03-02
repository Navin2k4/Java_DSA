// ? https://leetcode.com/problems/search-in-rotated-sorted-numsay/description/
// * 33 
// ! Google and Amazon Question
/*
 * There is an integer numsay nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an 
 * unknown pivot index k (1 <= k < nums.length) such that the resulting numsay is 
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

 * Given the numsay nums after the possible rotation and an integer target, 
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 
 ? Example 1:
 ? Input: nums = [4,5,6,7,0,1,2], target = 0
 ? Output: 4
 
 ? Example 2:
 ? Input: nums = [4,5,6,7,0,1,2], target = 3
 ? Output: -1
 
 ? Example 3:
 ? Input: nums = [1], target = 0
 ? Output: -1
 */


package BinarySearch;

public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target)); 
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find the pivot the array is not rotated
        if(pivot == -1){
            // just do normal bunary search
            return BinarySearchIndex(nums, target, 0, nums.length-1);
        }
        // If pivot has found we have found two ascending sorted array
        if(nums[pivot] == target){
            return pivot;
        }

        if( target >= nums[0]){
            return BinarySearchIndex(nums, target, 0, pivot-1);
        }

        return BinarySearchIndex(nums, target, pivot+1, nums.length-1);

    }

    static int BinarySearchIndex(int arr[], int target,int start,int end) {
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

    // does not work for duplicate values

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start) / 2 ;
            //  Four Cases
            if(mid < end && nums[mid] > nums[mid+1]){ // using mid < end since what happen if the mid is the last element and hence the numsay index out of bound will happpen
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){ // same as first case condition
                return mid-1;
            }

            // The below condition will fail if i have duplicate elements
            if(nums[mid] <= start){
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) { 
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            // If elements at middle , start , end are equal just skip the duplicates
            if( nums[mid] == nums[start] && nums[mid] == nums[end] )
            {
                // But what if the elements of the start and the end were the pivots??
                // check if start is pivot
                if( nums[ start ] > nums[ start + 1 ] ){
                    return start;
                }
                start++;
                if ( nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted so pivot should be in right
            else if( nums[start] < nums[mid] || ( nums[start] == nums[mid]  && nums[mid] > nums[end]) ){
                start = mid +1 ;
            }
            else{
                end = mid -1;
            }

        }
        return -1;
    }
}
