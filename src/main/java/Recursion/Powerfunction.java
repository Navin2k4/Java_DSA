package Recursion;

public class Powerfunction {
    public static void main(String[] args) {
        int result = powerOfTheNumber(2,2);
        System.out.println("Power : " + result);
    }
    static int powerOfTheNumber(int base,int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * powerOfTheNumber(base,exponent-1);
    }
}
