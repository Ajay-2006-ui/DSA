package DSA;

import java.util.ArrayList;

public class BacktrackingCOmbinationSum {

    static void generate(int[] arr, int index,
                         ArrayList<Integer> current, int sum) {

        if (sum == 7) {
            System.out.println(current);
            return;
        }

        if (index == arr.length || sum > 7) {
            return;
        }

        // TAKE
        current.add(arr[index]);
        generate(arr, index, current, sum + arr[index]);

        // UNDO
        current.remove(current.size() - 1);

        // DON'T TAKE
        generate(arr, index + 1, current, sum);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};

        generate(arr, 0, new ArrayList<>(), 0);
    }
}