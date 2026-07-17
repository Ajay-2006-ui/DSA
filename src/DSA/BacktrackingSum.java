package DSA;

import java.util.ArrayList;

public class BacktrackingSum {
    static void generate(int []arr,int index, ArrayList<Integer> Current,int sum) {
        if(index==arr.length) {
            if (sum == 3) {
                System.out.println(Current);
            }
            return;
        }
        Current.add(arr[index]);
        generate(arr,index+1,Current,sum+arr[index]);

        Current.remove(Current.size()-1);
        generate(arr,index+1,Current,sum);
    }
    public static void main(String[] args){
        int [] arr={1,2,3,0};
        generate(arr,0,new ArrayList<>() ,0);
    }
}



