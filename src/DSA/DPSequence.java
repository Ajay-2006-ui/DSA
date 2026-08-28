package DSA;
import java.util.*;
public class DPSequence {
    static int sequence(String A,String B,int i,int j,int[][]dp){
        if(i==A.length()||j==B.length()){
            return 0;

        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(A.charAt(i)==B.charAt(j)){
            dp[i][j]=1+sequence(A,B,i+1,j+1,dp);
        }
        else{
            int skipA=sequence(A,B,i+1,j,dp);
            int skipB=sequence(A,B,i,j+1,dp);
            dp[i][j]=Math.max(skipA,skipB);
        }
        return dp[i][j];


    }
    public static void main(String[] args){
        String A="abcde";
        String B="ace";

        int [][]dp=new int[A.length()][B.length()];
        for(int i=0; i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(sequence(A,B,0,0,dp));

    }
}
