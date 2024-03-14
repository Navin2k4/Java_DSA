package Recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("\nValue : "+fibo(n));
    }
    static int fibo(int n){
        System.out.print(n + " ");

        if( n < 2 ){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
