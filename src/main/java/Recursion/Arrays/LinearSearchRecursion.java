package Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 3, 5, 5, 8 };
        System.out.println(FindIndex(nums, 3, 0));
        // Return =s the first occurrence of the element
        System.out.println(LinearFindIndexFront(nums, 5, 0));
        // Returns the last occurrence of the element
        System.out.println(LinearFindIndexLast(nums, 5, nums.length - 1));
        findAllIndex(nums, 5, 0);
        System.out.println(list);
    }

    static boolean FindIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || FindIndex(arr, target, index + 1);

    }

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

}
