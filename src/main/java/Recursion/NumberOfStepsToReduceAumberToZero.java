// ?  https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
// ! Problem number : 1342

package Recursion;

public class NumberOfStepsToReduceAumberToZero {
    public static void main(String[] args) {
        System.out.println(CountSteps(14));
    }
    static int CountSteps(int num) {
        return helper(num, 0);
    }
    static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num%2 == 0) {
            return helper(num / 2, count + 1)   ;
        }
        return helper(num-1, count+1);
    }
}
