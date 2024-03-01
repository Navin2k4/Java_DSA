// https://leetcode.com/problems/richest-customer-wealth/

package LinearSearch;

class RichestCustomerWealth {
    public static void main(String[] args) {
        int accounts[][] = 
        {
            {1,2,3},
            {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int sum =0;
            for (int acc : account) {
                sum+=acc;
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}
