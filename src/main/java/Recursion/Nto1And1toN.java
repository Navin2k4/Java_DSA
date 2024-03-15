package Recursion;

public class Nto1And1toN {
    public static void main(String[] args) {
        nto1(5);
        System.out.println();
        F1ton(5);
        System.out.println();
        F1toNAndNto1(5);
    }
    static void nto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        nto1(n-1);
    }
    static void F1ton(int n){
        if(n==0){
            return;
        }
        F1ton(n-1);
        System.out.print(n+" ");
    }

    static void F1toNAndNto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        F1toNAndNto1(n-1);
        System.out.print(n+" ");
    }
}
