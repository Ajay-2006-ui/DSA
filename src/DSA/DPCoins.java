package DSA;
import java.util.*;
public class DPCoins {
    static int mincoins(int [] coins,int amount ,int[] dp){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int min=Integer.MAX_VALUE;
        for(int coin:coins){
             int result= mincoins( coins,amount - coin,dp);
            if(result!=Integer.MAX_VALUE){
                min=Math.min(min,1+result);
            }
        }
        dp[amount]=min;
        return dp[amount];
    }
    public static void main(String [] args){
        int [] coins={1,2,5};
        int amount =11;
        int[]dp=new int[amount+1];
         Arrays.fill(dp,-1);
        System.out.println(mincoins(coins,amount,dp));
    }

}
