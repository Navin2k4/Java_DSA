package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 12345;
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
}
