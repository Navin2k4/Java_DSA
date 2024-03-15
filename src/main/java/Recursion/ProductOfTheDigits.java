package Recursion;

public class ProductOfTheDigits {
    public static void main(String[] args) {
        int n = 123 ;
        System.out.println("Product of numbers : "+ Product(n));
    }
    static int Product(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * Product(n/10);
    }
}
