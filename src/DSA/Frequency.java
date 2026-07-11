package DSA;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {4, 4, 2, 4, 3, 4, 4};
        int n = arr.length;
        int freq=n/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>freq){
                System.out.println(entry.getKey());

            }


        }

    }
}
