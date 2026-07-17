package DSA;

import java.util.ArrayList;

public class BackTrackingSubSet {
    static void generate(int []arr,int index, ArrayList<Integer> Current) {
        if(index==arr.length){
            System.out.println(Current);
            return;
        }
        Current.add(arr[index]);
        generate(arr,index+1,Current);

        Current.remove(Current.size()-1);
        generate(arr,index+1,Current);
    }
    public static void main(String[] args){
        int [] arr={1,2,3};
        generate(arr,0,new ArrayList<>());
    }
}
