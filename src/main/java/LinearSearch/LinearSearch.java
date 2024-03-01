package LinearSearch;


public class LinearSearch {

 public static void main(String[] args) {
        int nums[] = {20,30,2,5,1,-1,34,6,73,100};
        int target = 5;
        int result = linearsearch(nums, target);
        System.out.println(result);
    }
    static int linearsearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
