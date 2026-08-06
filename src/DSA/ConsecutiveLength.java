package DSA;
import java.util.HashSet;

public class ConsecutiveLength {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        // Check every number
        for (int num : arr) {

            // Start only if it is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        System.out.println(maxLength);
    }
}