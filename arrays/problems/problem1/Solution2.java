package arrays.problems.problem1;

public class Solution2 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = (minPrice < price) ? minPrice : price;
            maxProfit = (maxProfit > price - minPrice) ? maxProfit : price - minPrice;
        }

        return maxProfit;
    }
}
