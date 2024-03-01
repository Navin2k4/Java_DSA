package BinarySearch;
public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {-14,-10,-2,0,1,7,9,10,15,23,45,67,76,100,108}; // sorted array
        int ans = BinarySearchIndex(array,108);
        System.out.println(ans+" Value : " + array[ans]);    }
    // Return the index
    // return if it does not exist return -1
    static int BinarySearchIndex(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            // Find the mddle element
            // int mid = (start+end) / 2; // might be possible that the start+end may exceed the range of integer in java which might lead to error 
            int mid = start + (end-start) / 2 ;
            if(target < arr[mid]){
                end = mid - 1; // For ascending
                // start = mid + 1 // For descending
            }
            else if(target > arr[mid]){
                start = mid + 1 ; // For ascending
                // end = mid - 1 // For descending
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}