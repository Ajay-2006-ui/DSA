package DSA;
import java.util.*;

public class GreedyAlgorithm {
    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8};
        int[] end = {4, 5, 6, 7, 9};

        int n = start.length;

// Store all activities as [start, end];
        int[][] activities = new int[n][2];

        // Store selected non-overlapping activities
        int[][] nonactivities = new int[n][2];

        // Fill activities array
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Sort by end time
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        // Select the first activity
        int count = 1;
        int last = activities[0][1];

        // Store first selected activity
        int selectedIndex = 0;
        nonactivities[selectedIndex][0] = activities[0][0];
        nonactivities[selectedIndex][1] = activities[0][1];
        selectedIndex++;

        // Check remaining activities
        for (int i = 1; i < n; i++) {

            int currentStart = activities[i][0];
            int currentEnd = activities[i][1];

            // If no overlap, select activity
            if (currentStart >= last) {

                count++;
                last = currentEnd;

                // Store selected activity
                nonactivities[selectedIndex][0] = currentStart;
                nonactivities[selectedIndex][1] = currentEnd;
                selectedIndex++;
            }
        }

        // Print count
        System.out.println("The number of activities without overlapping is: " + count);

        // Print selected activities
        System.out.println("The activities without overlapping are:");

        for (int i = 0; i < selectedIndex; i++) {
            System.out.println(nonactivities[i][0] + ", " + nonactivities[i][1] );
        }
    }
}