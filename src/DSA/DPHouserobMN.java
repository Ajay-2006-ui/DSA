package DSA;

import java.util.Arrays;

public class DPHouserobMN {
    static int rob(int[] money,int i,int [] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int skip=rob(money,i-1,dp);

        int take=money[i]+rob(money,i-2,dp);
        dp[i]=Math.max(skip,take);
        return dp[i];
    }
    public static void main(String[] args) {
        int money[]= {2,7,9,3};
        int dp[]=new int[money.length];
        Arrays.fill(dp,-1);
        System.out.println(rob(money,money.length-1,dp));
    }

}
