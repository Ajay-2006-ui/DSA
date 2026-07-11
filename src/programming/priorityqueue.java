package programming;

import java.util.PriorityQueue;

public class priorityqueue {
    public static void main (String[]args){
        int []arr={5,3,89,56,4,12,78,567,8900,};
        int k=3;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length; i++){
            if(arr[i] >pq.peek()){
            pq.remove();
            pq.add(arr[i]);
            }
        }
System.out.println(pq);

    }
}
