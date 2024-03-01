//! https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// 852 same as 162
/*
 ? An array arr is a mountain if the following properties hold:
        * arr.length >= 3
        * There exists some i with 0 < i < arr.length - 1 such that:
                * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
                * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 ? Given a mountain array arr, return the index i such that 
        * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
        ! You must solve it in O(log(arr.length)) time complexity. ( Binary Search )
Example 1:
Input: arr = [0,1,0]
Output: 1
Example 2:
Input: arr = [0,2,1,0]
Output: 1
Example 3:
Input: arr = [0,10,5,2]
Output: 1
 */
package BinarySearch;

public class PeakIndexInAMountainArray {
    
    public static void main(String[] args) {
        
    }

    static int peakIndexInMountainArray(int[] arr) {
        return -1;
    }
}
