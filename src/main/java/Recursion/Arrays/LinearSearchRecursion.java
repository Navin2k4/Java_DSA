package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 3, 5, 5, 8 };
        System.out.println(FindIndex(nums, 3, 0));
        System.out.println(LinearFindIndexFront(nums, 5, 0));
        System.out.println(LinearFindIndexLast(nums, 5, nums.length - 1));
        findAllIndex(nums, 5, 0);

        // ! The list returned here is creeated outside the method using static
        // variable.
        System.out.println(list);

        // ! This list is created at the main class and the function references the list
        // ! and dosent generatr a new list
        ArrayList<Integer> newlist = new ArrayList<>();
        System.out.println(findAllIndexAsArray(nums, 5, 0, newlist));
        
        System.out.println(findAllIndexAsArray2(nums, 5, 0));

    }

    // ? Returning the boolean weather the value is in the array or not
    static boolean FindIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || FindIndex(arr, target, index + 1);

    }

    // ? Returning the index of the element
    static int LinearFindIndexFront(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return LinearFindIndexFront(arr, target, index + 1);
        }
    }

    // ? Returning the last index of the element
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

    // ? Returning the index as an arraylist
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    // ? Passing the array list as the parameter
    static ArrayList<Integer> findAllIndexAsArray(int[] arr, int target, int index, ArrayList<Integer> arrlist) {
        if (index == arr.length) {
            return arrlist;
        }
        if (arr[index] == target) {
            arrlist.add(index);
        }
        return findAllIndexAsArray(arr, target, index + 1, arrlist);
    }

    // ? using arraylist and not passing it into the argument and also using them
    // ? inside the funciton
    static ArrayList<Integer> findAllIndexAsArray2(int[] arr, int target, int index) {
        ArrayList<Integer> newlist = new ArrayList<>();
        if (index == arr.length) {
            return newlist;
        }
        if (arr[index] == target) {
            newlist.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexAsArray2(arr, target, index + 1);
        newlist.addAll(ansFromBelowCalls);
        return newlist;
    }
}
