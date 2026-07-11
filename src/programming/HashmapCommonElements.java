package programming;
import java.util.HashMap;

public class HashmapCommonElements {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: store frequency of arr1
        for(int i = 0; i < arr1.length; i++) {
            int val = arr1[i];

            if(map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        // Step 2: check arr2 and print common elements
        for(int i = 0; i < arr2.length; i++) {
            int val = arr2[i];

            if(map.containsKey(val)) {
                System.out.print(val + " ");

                map.remove(val);
            }
        }
    }
}
