public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(countFrequency(arr));
    }

    static int countFrequency(int[] arr) {
        int maxFrequency = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequency = 1; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        int countMaxFrequency = 0;
        for (int num : arr) {
            if (countFrequency(arr, num) == maxFrequency) {
                countMaxFrequency++; 
            }
        }

        return countMaxFrequency;
    }

    static int countFrequency(int[] arr, int num) {
        int count = 0;
        for (int value : arr) {
            if (value == num) {
                count++; // Count occurrences of num in arr
            }
        }
        return count;
    }
}
