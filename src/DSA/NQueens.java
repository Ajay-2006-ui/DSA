package DSA;

public class NQueens {

    static void generate(char[][] board, int row) {

        // Base Case
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        // Try every column
        for (int col = 0; col < board.length; col++) {

            // Check whether current position is safe
            if (isSafe(board, row, col)) {

                // Choose
                board[row][col] = 'Q';

                // Recursive Call
                generate(board, row + 1);

                // Undo (Backtracking)
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {

        // Check Same Column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // Check Upper Left Diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q')
                return false;
        }

        // Check Upper Right Diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = '.';
            }
        }

        generate(board, 0);
    }
}
