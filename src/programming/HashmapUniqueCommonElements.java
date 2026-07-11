package programming;
import java.util.HashMap;

public class HashmapUniqueCommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: store elements of arr1
        for(int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], 1);   // just mark presence
        }

        // Step 2: check arr2
        for(int i = 0; i < arr2.length; i++) {
            int val = arr2[i];

            if(map.containsKey(val)) {
                System.out.print(val + " ");

                map.remove(val); // remove to avoid duplicate printing
            }
        }
    }
}


