package Arrays;
/*
    Problem Link
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class Best_Time_Buy_Sell_Stock {

    // Brute Force Approach
    public static int maxProfitBrute(int[] price) {

        int ans = 0;
        for(int i=0 ; i<price.length ; i++){
            for(int j=i+1 ; j<price.length ; j++){
                if(price[j]>price[i]){
                    ans = Math.max(ans,price[j]-price[i]);
                }
            }
        }
        return ans;
    }

    //Optimal Approach
    public static int maxProfit(int[] price){

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int j : price) {
            if (minPrice > j)
                minPrice = j;
            maxProfit = Math.max(maxProfit, j - minPrice);
        }
        return maxProfit;
    }


    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfitBrute(arr));
     }

}
