package Recursion;

public class SumOfTheDigits {
    public static void main(String[] args) {
        int n = 12345 ;
        System.out.println("Sum of numbers : "+sumOfNumbers(n));
    }
    static int sumOfNumbers(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfNumbers(n/10);
    }
}
