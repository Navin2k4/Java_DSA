package Recursion;

public class PalindromeOfANumber {

    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palin(n));
    }

    static boolean palin(int n){
        return (n == reverse(n));
    }
    static int reverse(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digit) {
        if (n == 0) {
            return 0;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }
}
