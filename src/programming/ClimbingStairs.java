package programming;
public class ClimbingStairs {
    public static void main(String[] args) {
        int[] height = {10, 20, 15, 8, 25};
        int n = height.length;
        int[] dp = new int[n];
        dp[0] = height[0];

        int i = 0;
        while (i < n - 1) { // ensure at least i+1 exists
            if (i + 2 < n) { // both i+1 and i+2 exist
                if (height[i+2] > height[i+1]) {
                    dp[i+1] = dp[i] + height[i+1];
                    i += 1; // move one step
                } else {
                    dp[i+2] = dp[i] + height[i+2];
                    i += 2; // move two steps
                }
            } else {
                // only i+1 exists
                dp[i+1] = dp[i] + height[i+1];
                i += 1;
            }
        }

        int minimum_cost = dp[n-1];
        System.out.println(minimum_cost);
    }
}