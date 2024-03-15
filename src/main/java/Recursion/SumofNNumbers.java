package Recursion;

public class SumofNNumbers {
    public static void main(String[] args) {
        System.out.println("Sum is : "+ sumofN(2));
    }
    static int sumofN(int n){
        if(n==0){
            return n;
        }
        return n + sumofN(n-1);
    }
}
