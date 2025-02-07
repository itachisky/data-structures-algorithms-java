package arrays.problems.problem1;

public class Solution1 {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }

        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] input1 = {7,1,5,3,6,4};
        int profit1 = maxProfit(input1);
        System.out.println("Max Profit: " + profit1);

        int[] input2 = {7,6,4,3,1};
        int profit2 = maxProfit(input2);
        System.out.println("Max Profit: " + profit2);
    }
}
