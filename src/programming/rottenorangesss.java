package programming;
import java.util.*;

public class rottenorangesss {
    public static int RottingOranges(int[][] arr) {

        LinkedList<int[]> queue = new LinkedList<>();

        // Step 1: Add all rotten oranges into queue
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 2) {
                    int[] temp = {i, j, 0};   // r, c, time
                    queue.addLast(temp);
                }
            }
        }

        int ans = 0;

        // BFS
        while (queue.size() > 0) {

            int[] rem = queue.removeFirst();

            int r = rem[0];
            int c = rem[1];
            int time = rem[2];

            ans = Math.max(ans, time);

            // DOWN
            if (r + 1 < arr.length && arr[r + 1][c] == 1) {
                int[] temp = {r + 1, c, time + 1};
                queue.addLast(temp);
                arr[r + 1][c] = 2;
            }

            // LEFT
            if (c - 1 >= 0 && arr[r][c - 1] == 1) {
                int[] temp = {r, c - 1, time + 1};
                queue.addLast(temp);
                arr[r][c - 1] = 2;
            }

            // UP
            if (r - 1 >= 0 && arr[r - 1][c] == 1) {
                int[] temp = {r - 1, c, time + 1};
                queue.addLast(temp);
                arr[r - 1][c] = 2;
            }

            // RIGHT
            if (c + 1 < arr[0].length && arr[r][c + 1] == 1) {
                int[] temp = {r, c + 1, time + 1};
                queue.addLast(temp);
                arr[r][c + 1] = 2;
            }
        }

        // Check if any fresh orange left
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println(RottingOranges(arr));
    }
}



