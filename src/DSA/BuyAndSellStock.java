package DSA;

public class BuyAndSellStock {
    public static void main(String[] args) {

        int[] arr = {9, 2, 7, 1, 5, 8, 3};

        int buy = arr[0];
        int maxProfit = 0;

        int currentBuyIndex = 0;

        int finalBuyIndex = 0;
        int finalSellIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            // Update minimum buying price
            if (arr[i] < buy) {
                buy = arr[i];
                currentBuyIndex = i;
            }

            // Calculate profit if sold today
            int profit = arr[i] - buy;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;

                finalBuyIndex = currentBuyIndex;
                finalSellIndex = i;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);

        System.out.println("Buy at index: " + finalBuyIndex +
                " value: " + arr[finalBuyIndex]);

        System.out.println("Sell at index: " + finalSellIndex +
                " value: " + arr[finalSellIndex]);
    }
}