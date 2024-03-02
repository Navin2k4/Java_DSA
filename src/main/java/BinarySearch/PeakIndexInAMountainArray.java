//! https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//*  852 (MEDIUM) same as 162
// ! Biotonic Array or mointain array first increase and than decreases 
/*
 ? An array arr is a mountain if the following properties hold:
        * arr.length >= 3
        * There exists some i with 0 < i < arr.length - 1 such that:
                * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
                * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        * Does not contain duplicate elements 
 ? Given a mountain array arr, return the index i such that 
        * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
        ! You must solve it in O(log(arr.length)) time complexity. ( Binary Search )
? Example 1:
? Input: arr = [0,1,0]
? Output: 1
? Example 2:
? Input: arr = [0,2,1,0]
? Output: 1
? Example 3:
? Input: arr = [0,10,5,2]
? Output: 1
                                                                                    
* Approach 
? Half array is in ascending
? Half array is in descending
*/
package BinarySearch;

public class PeakIndexInAMountainArray {    
    public static void main(String[] args) {
        int arr[] ={0,10,5,2};
        int res = peakIndexInMountainArray(arr);
        System.out.println("Index : "+res+" Value : "+arr[res]);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            if( arr[mid] > arr[mid+1] ){
                // i am in the decreasing part of the array
                // This may be the answer, but look at the left side once
                // This is why end != mid-1
                end = mid;
            }
            else{
                // i am in ascending part of array
                start = mid + 1; // Because mid+1 element is > than mid element
            }
            // In the end start == end and pointing to the largest number because of the above two steps
            // Start and end are always trying to find the max element in above 2 check
            // hence when they are pointing to one element that is the maimum one because that is what 2 setp says
            // more elobration : at every point of start and end they have the best possible answer till that time 
            // and if we are saying that only one item is remaining because of above line that is the best possible answer  
        }

        return start;// or also end as both returns the ans same at last
    }
}
