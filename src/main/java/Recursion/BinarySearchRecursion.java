package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8}; 
        int target = 7;
        int index = BSRecursion(arr,0,arr.length-1,target);
        if(index == -1 ){
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element " + arr[index] + " found at index : "+ index);
        }
    }

    static int BSRecursion(int arr[],int start,int end,int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        } else if (arr[mid] > target){
            return BSRecursion(arr, start, mid-1, target);
        } else {
            return BSRecursion(arr, mid+1, end, target);
        }
    }
}
