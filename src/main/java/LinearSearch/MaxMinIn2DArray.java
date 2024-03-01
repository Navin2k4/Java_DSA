package LinearSearch;

public class MaxMinIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 85, 69, 54 },
                { 45, 25, 13, 6 },
                { 7, 8, 9, 2 }
        };

        System.out.println(max(arr));
        System.out.println(min(arr));

    }    
    static int max(int arr[][]){
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if( element > max){
                    max = element;
                }
            }
        }
        return max;
    }
    
    static int min(int arr[][]) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }
        return min;
    }
}
