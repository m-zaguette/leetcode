public class LeetCode121_BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
        System.out.println(maxProfit(new int[] { 2, 4, 1 }));
        System.out.println(maxProfit(new int[] { 2, 1 }));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int buy = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }

        return profit;
    }
}
