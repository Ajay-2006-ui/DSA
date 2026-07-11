package DSA;

import java.util.HashMap;
import java.util.Map;

public class Kgreater {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int n = arr.length;
        int k=2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>=k){
                System.out.print(entry.getKey()+" ");

            }


        }

    }
}

