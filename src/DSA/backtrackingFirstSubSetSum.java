package DSA;
import java.util.ArrayList;

public class backtrackingFirstSubSetSum {
    static boolean generate(int[] arr, int index,
                            ArrayList<Integer> current,
                            int sum) {

        if (sum == 3) {
            System.out.println(current);
            return true;
        }

        if (index == arr.length) {
            return false;
        }

        // Take
        current.add(arr[index]);

        if (generate(arr, index + 1,
                current, sum + arr[index])) {
            return true;
        }

        // Undo
        current.remove(current.size() - 1);

        // Don't Take
        if (generate(arr, index + 1,
                current, sum)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0};

        generate(arr, 0,
                new ArrayList<>(), 0);
    }
}