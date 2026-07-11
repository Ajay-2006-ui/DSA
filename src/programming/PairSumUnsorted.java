package programming;
import java.util.HashSet;

public class PairSumUnsorted {
    public static void main(String[] args) {

        int[] arr = {3, 1, 7, 4};
        int target = 8;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (set.contains(complement)) {
                System.out.println("Found pair: " + arr[i] + " and " + complement);
                return;
            }

            set.add(arr[i]);
        }

        System.out.println("No pair found");
    }
}
