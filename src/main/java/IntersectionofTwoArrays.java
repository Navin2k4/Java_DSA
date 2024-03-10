import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();

        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;

        // Traverse both arrays
        while (i < nums1.length && j < nums2.length) {
            // If the current elements are equal, add to the result list
            if (nums1[i] == nums2[j]) {
                // Add to the result list if the list is empty or the last element is not equal
                // to the current element
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != nums1[i]) {
                    resultList.add(nums1[i]);
                }
                i++;
                j++;
            }
            // Move pointers based on comparison
            else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert result list to array
        int[] resultArray = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            resultArray[k] = resultList.get(k);
        }

        return resultArray;
    }
}
