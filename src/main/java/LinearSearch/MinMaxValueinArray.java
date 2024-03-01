package LinearSearch;

public class MinMaxValueinArray {
    public static void main(String[] args) {
        int nums[] = { 20, 30, 2, 5, 51, 34, 6, 73, 100 };
        System.out.println(min(nums));
        System.out.println(max(nums));

    }    

    static int min(int arr[]){
        int ans = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    
    static int max(int arr[]) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
