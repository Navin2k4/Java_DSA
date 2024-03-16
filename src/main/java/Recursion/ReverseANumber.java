package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(revnumberusinghelper(num));
        revnum(num);
        System.out.println(sum);
    }
    static int sum = 0;
    static void revnum(int num){
        if(num == 0){
            return ;
        }
        int rem = num%10;
        sum = sum * 10 +rem;
        revnum(num/10);
    }

    static int revnumberusinghelper(int n) {
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
