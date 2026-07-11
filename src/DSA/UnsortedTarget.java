package DSA;
import java.util.*;
public class UnsortedTarget {
    public static void main(String[] args) {
        int arr[]={3,6,7,1,4,2,};
        int target =8;
        boolean found=false;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
        int complement=target-arr[i];

    if(set.contains(complement)){
        found=true;
        System.out.print(target+" " +"found");
        break;
    }
    set.add(arr[i]);

    }
        if(!found){
            System.out.println("Not Found");
        }
    }

    }
