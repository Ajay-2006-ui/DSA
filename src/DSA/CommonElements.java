package DSA;
import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 9, 2, 5, 1};
        int[] arr2 = {8, 7, 4, 4, 3, 1, 10};
        int[] arr3 = new int[arr1.length];
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (set2.contains(arr1[i])) {
                set3.add(arr1[i]);

            }
        }
        for(int  num:set3){
            System.out.print(num+" ");
        }

    }
}