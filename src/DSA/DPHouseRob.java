package DSA;

public class DPHouseRob {
    static int maxmoney(int [] money) {
        int[] dp = new int[money.length];
        int n = money.length;
        if (n == 1) {
            return money[0];
        }
        dp[0]= money[0];
        dp[1]=Math.max(money[0],money[1]);
        for (int i = 2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+money[i]);
        }
        return dp[n-1];

    }
    public static void main(String[] args) {
        int [] money = {2,7,8,4};
        System.out.println(maxmoney(money));
    }

}
