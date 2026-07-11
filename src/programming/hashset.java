package programming;
import java.util.*;

public class hashset {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        HashSet<Integer> set = new HashSet<>();

        // Step 1: store unique elements of arr1
        for(int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Step 2: check arr2
        for(int i = 0; i < arr2.length; i++) {
            int val = arr2[i];

            if(set.contains(val)) {
                System.out.print(val + " ");

                set.remove(val); // avoid duplicate printing
            }
        }
    }
}