package DSA;
import java.util.*;

public class DPSOWays {
    static int UniquePaths(int rows,int cols){
        int[]dp=new int[cols];
        Arrays.fill(dp,1);
        for(int row=1;row<rows;row++){
            for(int col=1;col<cols;col++){
                dp[col]=dp[col-1] +dp[col];
            }
        }
        return dp[cols-1];

    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        System.out.println(UniquePaths(rows,cols));
    }
}


