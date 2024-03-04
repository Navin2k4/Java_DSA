package BinarySearch;

import java.util.Arrays;

public class BinarySearch2DArray {
    // Matrix sorted row and column wise
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {16,27,39,46},
            {33,34,40,50}
        };
        int[] result = search(matrix, 39);
        System.out.println(Arrays.toString(result));
        
    } 
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;  // last column value if you use nxm use m 

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{ // matrix[row][col] > target
                col--;
            }
        }
        return new int[] { -1, -1 }; 

    }
}
