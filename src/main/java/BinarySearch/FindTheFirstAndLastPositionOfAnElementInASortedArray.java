/* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
34
!!! Facebook Interview Question
 * Given an array of integers nums sorted in non-decreasing order, 
        * find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 
? Example 1:
? Input: nums = [5,7,7,8,8,10], target = 8
? Output: [3,4]

? Example 2:
? Input: nums = [5,7,7,8,8,10], target = 6
? Output: [-1,-1]

? Example 3:
? Input: nums = [], target = 0
? Output: [-1,-1]


* Approach
! By using two binary search
! 1st binary search is for the start index
! 2nd binary search if fot the last index
! We can also do it in the one binary search
*/

package BinarySearch;
import java.util.Arrays;

public class FindTheFirstAndLastPositionOfAnElementInASortedArray {
    public static void main(String[] args) {
        int array[] = { 5,7,7,8,8,10 };
        int ans[] = searchRange(array, 8);
        System.out.println(Arrays.toString(ans));
    }   


    static int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        // check for first occourance of target first
        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    
    // This function just return the index value of what we are searching (target)
    static int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1; 
            } 
            else if (target > nums[mid]) {
                start = mid + 1; 
            } 
            else {
                // potential answer found but always not correct so checking weather we need to find the start of the value 
                // or the end of the value using the boolean varibale
                ans = mid;
                if( findStartIndex ){
                    end = mid - 1 ;
                }
                else{
                    start = mid + 1 ;
                }
            }
        }
    return ans;
    }
}