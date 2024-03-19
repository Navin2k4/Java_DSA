package Recursion.Arrays;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int nums[] = {2,4,3,5,5,8};
        System.out.println(LinearRecursion(nums, 3, 0));
        // Return =s the first occourence of the element
        System.out.println(LinearFindIndexFront(nums, 5, 0));
        // Returns the last occourence of the element
        System.out.println(LinearFindIndexLast(nums, 5, nums.length-1));

    }
    static boolean LinearRecursion(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || LinearRecursion(arr, target, index+1);

    }
    static int LinearFindIndexFront(int[] arr, int target,int index){
        if(index == arr.length){
            return -1;
        }
        if( arr[index] == target){
            return index;
        } else {
            return LinearFindIndexFront(arr, target, index + 1);
        }
    }
    
    static int LinearFindIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return LinearFindIndexLast(arr, target, index - 1);
        }
    }
}
