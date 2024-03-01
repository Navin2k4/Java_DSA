package LinearSearch;
public class LinearSearchInRange {
    public static void main(String[] args) {
        int nums[] = { 20, 30, 2, 5, 1, -1, 34, 6, 73, 100 };
        int target = 5;
        int result = linearsearch(nums, target,1,5);
        System.out.println(result);
    }

    static int linearsearch(int arr[], int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
    
}