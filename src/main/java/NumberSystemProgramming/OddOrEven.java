package NumberSystemProgramming;
public class OddOrEven {
    public static void main(String[] args) {
        int n = 11 ;
        if( (n & 1 ) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }    
}
