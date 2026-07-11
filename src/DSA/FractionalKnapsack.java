package DSA;

import java.util.*;

public class  FractionalKnapsack {
    public  static void main(String[] args) {
        int []value={60,100,120};
        int []weight={10,20,30};
        int capacity=50;

        int n=value.length;
        int [][]items=new int[n][2];
        for(int i=0;i<n;i++){
            items[i][0]=value[i];
            items[i][1]=weight[i];
        }
        Arrays.sort(items,(a,b)-> Double.compare((double) b[0]/b[1],(double) a[0]/a[1]));
        double totalvalue=0.0;
        for(int i=0;i<n;i++){
            int CurrentValue=items[i][0];
            int CurrentWeight=items[i][1];

            if(CurrentWeight<=capacity){
                totalvalue+=CurrentValue;
                capacity-=CurrentWeight;
            }
            else{
                double ratio=(double)CurrentValue/CurrentWeight;
                totalvalue+=capacity*ratio;
                break;

            }
        }
        System.out.println("Maximum value= " +totalvalue);


    }
}
