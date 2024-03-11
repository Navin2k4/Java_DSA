// ? https://leetcode.com/problems/missing-number/description/
// ! Problem number 268  Google
// ! Approach using cyclic sort
/*
 * Given an num say nums containing 
 * n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the numsay.
 */

package CyclicSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    
    static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correctIndex = nums[i];
            if (nums[i] < n && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return n;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
