package Arrays;
// https://leetcode.com/problems/richest-customer-wealth/
public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowSum = rowSum + accounts[i][j];
            }
            if (rowSum > ans) {
                ans = rowSum;
            }
        }
        return ans;
    }
}

