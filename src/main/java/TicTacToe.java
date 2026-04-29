public class TicTacToe {

    static char[][] board = {
            {'_', '_', '_'},
            {'_', 'X', '_'},
            {'_', '_', 'O'}
    };

    /**
     * Entry point of the program. Tests the validation logic
     * using sample row and column values.
     */
    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // Expected: false (cell occupied)
        System.out.println(isValidMove(0, 0)); // Expected: true (cell empty)
        System.out.println(isValidMove(3, 0)); // Expected: false (out of bounds)
    }


    static boolean isValidMove(int row, int col) {
        // Check if row and col are within bounds
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        // Check if the cell is empty
        return board[row][col] == '_';
    }
}