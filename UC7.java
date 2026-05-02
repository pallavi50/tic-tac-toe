import java.util.Random;

public class Uc7 {
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void computerMove(char[][] board, char symbol) {
        Random rand = new Random();
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] index = convertSlotToIndex(slot);
            int row = index[0];
            int col = index[1];
            if (isValidMove(board, row, col)) {
                placeMove(board, row, col, symbol);
                break;
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        computerMove(board, 'O');

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}