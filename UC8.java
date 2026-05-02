import java.util.Scanner;

public class GameLoop {
    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            printBoard();
            int slot = sc.nextInt();

            if (isValidMove(slot)) {
                board[slot - 1] = currentPlayer;

                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins");
                    gameRunning = false;
                } else if (checkDraw()) {
                    printBoard();
                    System.out.println("Draw");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }

    static void printBoard() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    static boolean isValidMove(int slot) {
        return slot >= 1 && slot <= 9 && board[slot - 1] != 'X' && board[slot - 1] != 'O';
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    static boolean checkWin() {
        int[][] p = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };

        for (int[] a : p) {
            if (board[a[0]] == currentPlayer &&
                board[a[1]] == currentPlayer &&
                board[a[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    static boolean checkDraw() {
        for (char c : board) {
            if (c != 'X' && c != 'O') return false;
        }
        return true;
    }
}