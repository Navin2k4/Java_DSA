package Recursion;

public class CountNumberOfZeros {
    public static void main(String[] args) {
        System.out.println(CountZero(30204000));
    }
    static int CountZero(int number){
        return helper(number,0);
    }

    // Special pattern how to pass a value to the above calls
    static int helper(int num,int count){
        if(num==0){
            return count;
        }
        int rem = num %10;
        if(rem == 0 ){
            return helper(num/10,count+1);
        }
        return helper(num/10, count);
    }
}
