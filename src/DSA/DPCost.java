package DSA;

public class DPCost {
    static int mincost(int money[]){
        int n=money.length;
        int []dp=new int[n];
        dp[0]=money[0];
        dp[1]=money[1];
        for(int i=2;i<n;i++){
            dp[i]=Math.min(dp[i-1],dp[i-2])+money[i];
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String[] args) {
        int [] cost={10,15,20};
        System.out.println(mincost(cost));
    }
}
