package LinearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindNumberWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    
    static int findNumbers(int[] nums) {

        int count =0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //Using Log funcion -> Reduces the time complexity
    static boolean even(int num){
        return digits2(num) % 2 == 0;
    }

    static int digits2(int num){
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }

    //Counts the number of digits in a number 
    static int digits(int num){
        // Make the number positive if it is negative
        if(num<0){
            num = num*-1;
        }
        // If it has 0 return 1 since it has 1 digit
        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num>0){
            count++;
            num = num /10;
        }
        return count;
    }

}