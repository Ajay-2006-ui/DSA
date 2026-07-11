package programming;

public class DFS {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == 1) {
                    DFS(arr, i, j);
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    public static void DFS(int[][] arr, int i, int j) {

        // Base condition (out of bounds OR water)
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0) {
            return;
        }

        // Mark current cell as visited
        arr[i][j] = 0;

        // Explore all 4 directions
        DFS(arr, i + 1, j); // down
        DFS(arr, i, j + 1); // right
        DFS(arr, i - 1, j); // up
        DFS(arr, i, j - 1); // left
    }
}


