//! https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// 744
/*
 * You are given an letteray of characters letters that is sorted in non-decreasing order, and a character target. 
 * There are at least two different characters in letters.
 ? Return the smallest character in letters that is lexicographically greater than target. 
 ! If such a character does not exist, return the first character in letters. ( i.e. The letters wrap around )
 
 * Approach
 ! This is the same as the cieling of an target
 ! Ignore the target = what we are looking for condition.
 ! When letters wrap around ( letters = ["x","x","y","y"], target = "z" ) => start % N = 0 ( ie. first position )
        ? Because Condition Violated => [ start = end + 1 ] => [ length ] => N 

 
 ? Example 1:
    ? Input: letters = ["c","f","j"], target = "a"
    ? Output: "c"
    ? Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 ? Example 2:
    ? Input: letters = ["c","f","j"], target = "c"
    ? Output: "f"
    ? Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
 ? Example 3:
    ? Input: letters = ["x","x","y","y"], target = "z"
    ? Output: "x"
    ? Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */

package BinarySearch;

public class FindSmallestLetterGreaterthatTarget {
    public static void main(String[] args) {
        char array[] = { 'c', 'f', 'j'};
        char ans = nextGreatestLetter(array, 'a');
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length] ;  // ! Statement Changed from ( return -1 ) to ( return start ) the Normal Binary search
    }
       
}
