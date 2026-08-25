package DSA;

import java.util.Arrays;

public class DPWaysReach {
    static int waystoreach(int row ,int col,int rows,int cols,int [][]dp){
        if(row==rows-1&&col==cols-1){
            return 1;
        }
        if(row>=rows||col>=cols){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int right =waystoreach(row,col+1,rows,cols,dp);
        int down=waystoreach(row+1,col,rows,cols,dp);
        dp[row][col]=right +down;
        return dp[row][col];
    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        int [][]dp=new int[rows][cols];
        for(int i=0; i<rows; i++){
            Arrays.fill(dp[i],-1);
        }
        int answer= waystoreach(0,0,rows ,cols,dp);
        System.out.println(answer);
    }
}
