package DSA;

import java.util.Arrays;

public class DPCostStairsM {
    static int  CostOfStairs(int []cost ,int i, int []dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int onestep = CostOfStairs(cost,i+1,dp);
        int twostep= CostOfStairs(cost,i+2,dp);

        dp[i]=cost[i]+Math.min(onestep,twostep);
        return dp[i];
    }
    public static void main(String[] args) {
        int [] cost = {10,15,20};
        int[]dp = new int [cost.length];
        Arrays.fill(dp,-1);
        int answer=Math.min(CostOfStairs(cost,0,dp),CostOfStairs(cost,1,dp));
        System.out.println(answer);
    }
}
