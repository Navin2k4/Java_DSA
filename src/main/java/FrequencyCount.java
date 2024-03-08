public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,4};
        System.out.println(countfrequency(arr));
    }
    static int countfrequency(int[] arr){
        int freq = 1;
        boolean nofreq = false;
        for(int i=0;i<arr.length ; i++){
            for (int j = 0 ; j< arr.length ; j++ ){
                if(arr[i] == arr[j]){
                    freq ++; 
                    nofreq = true;
                    break;
                }
            }
        }
        if(!nofreq){
            return arr.length;
        }
        else{
            return freq;
        }
    }
}
