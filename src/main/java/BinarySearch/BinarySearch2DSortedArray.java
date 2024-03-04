package BinarySearch;

import java.util.Arrays;

// Here the matrix is strictly sorted

public class BinarySearch2DSortedArray {
public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int[] result = searchIn2dSortedArray(matrix, 10);
        System.out.println(Arrays.toString(result));
        
    } 

    // search in the row provided between the column start and end provided provided

    static int[] SimpleBinarySearch(int[][] matrix,int row,int colstart , int colend,int target){
        while(colstart <=colend ){
            int mid = colstart + ( colend - colstart ) / 2;
            if( matrix[row][mid] == target ){
                return new int[]{row,mid};
            }
            if( matrix[row][mid] < target){
                colstart= mid+1;
            } else {
                colend = mid -1;
            }
        }
        return new int[] { -1,-1 };
    }

    static int[] searchIn2dSortedArray(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautious , matrix may be empty

        if(rows == 1){
            return SimpleBinarySearch(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows-1;
        int colmid = cols/2;
        // run the loop till two rows are remaining
        while(rowStart<rowEnd-1){  // while this is true it have more than two rows
            int mid  = rowStart + (rowEnd - rowStart) /2;
            if(matrix[mid][colmid] == target){
                return new int[] { mid, colmid };
            }
            if(matrix[mid][colmid] < target){
                rowStart = mid;
            }
            else{
                rowEnd = mid;
            }
        }

        // Now we have two rows 
        // check if thetarget is in the col of 
        if(matrix[rowStart][colmid] == target){
            return new int[] { rowStart, colmid };

        }
        if (matrix[rowStart][colmid] == target) {
            return new int[] { rowStart+1, colmid };

        }
        // search in first half 
        if ( target <= matrix[rowStart][colmid-1]){
            return SimpleBinarySearch(matrix, rowStart, 0, colmid-1, target);
        }
        // search in second half
        if ( target >= matrix[rowStart][colmid+1]  && target<=matrix[rowStart][cols-1] ){
            return SimpleBinarySearch(matrix, rowStart, colmid-1 , cols-1 , target);
        }
        // search in third half
        if ( target <= matrix[rowStart + 1][colmid -1 ]){
            return SimpleBinarySearch(matrix, rowStart+1, 0 , colmid-1 , target);
        } else {
            return SimpleBinarySearch(matrix, rowStart+1, colmid+1 , cols-1 , target);
        }

    }   
}
