package DSA;
import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int n = intervals.length;

        // Sort by start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int i = 1;   // next interval to process
        int j = 0;   // current merged interval index

        while (i < n) {

            // If intervals overlap
            if (intervals[i][0] <= intervals[j][1]) {

                // Extend the end if needed
                intervals[j][1] =
                        Math.max(intervals[j][1], intervals[i][1]);
            }
            else {
                // Start a new merged interval
                j++;
                intervals[j][0] = intervals[i][0];
                intervals[j][1] = intervals[i][1];
            }

            i++;
        }

        // Print merged intervals from index 0 to j
        for (int k = 0; k <= j; k++) {
            System.out.println(
                    "[" + intervals[k][0] + ", " + intervals[k][1] + "]"
            );
        }
    }
}