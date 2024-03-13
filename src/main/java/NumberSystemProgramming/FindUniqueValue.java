package NumberSystemProgramming;

public class FindUniqueValue {
    public static void main(String[] args) {
        int arr[]  = { 2,3,4,1,2,1,3,6,4 };
        System.out.println(findunique(arr));
    }
    static int findunique(int[] arr){
        int unique = 0 ;
        for(int x : arr){
            unique ^= x; // ! The duplicate values cancel each other while using XOR since a^a = 0 and 0^a = a
        }
        return unique;
    }
}
