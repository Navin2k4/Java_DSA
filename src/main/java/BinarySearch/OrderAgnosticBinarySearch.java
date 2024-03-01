package BinarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int array1[] = {-14,-10,-2,0,1,7,9,10,15,23,45,67,76,100,108}; // ascending sorted array
        int ans1 = OrderAgnosticBS(array1,15);
        System.out.println("Index : "+ans1+" Value : " + array1[ans1]);

        int array2[] = { 99, 42, 33, 21, 20, 15, 10, 11, 8, 5, 2, 0, -1 }; // descending sorted array
        int ans2 = OrderAgnosticBS(array2, 10);
        System.out.println("Index : "+ans2 + " Value : " + array2[ans2]);    
    }
    
    static int OrderAgnosticBS(int arr[],int target){
        // compare First and Last element to find weather the array is ascending or desending
        // if start > final => ascending 
        // else descending
        int start = 0;
        int end = arr.length-1;

        // find weather the array is ascending or descending order
        boolean isAsc = arr[start] < arr[end] ; // since it is a expression it returns true or false

        while(start<=end){
            int mid = start + (end-start) / 2 ;
            if( arr[mid] == target )
                return mid;
            
            if(isAsc){
                if (target < arr[mid])
                    end = mid - 1; // For ascending
                else
                    start = mid + 1; // For ascending
            } 
            else {
                if (target > arr[mid])
                    end = mid - 1; // For descending
                else
                    start = mid + 1; // For descending
            }
        }
        return -1;
    }
}
