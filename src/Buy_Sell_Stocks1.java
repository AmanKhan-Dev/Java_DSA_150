public class Buy_Sell_Stocks1 {
    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));



    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE; // Track the minimum price

        int maxProfit = 0; // Track the maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update min price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update max profit
            }
        }

        return maxProfit;
    }



}
