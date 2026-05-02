public class UC9 {
    static char[] board = {'1','2','3','4','5','6','7','8','9'};
    static char currentPlayer = 'X';

    static boolean checkWin() {
        for (int i = 0; i < 9; i += 3) {
            if (board[i] == currentPlayer &&
                board[i + 1] == currentPlayer &&
                board[i + 2] == currentPlayer)
                return true;
        }

        for (int i = 0; i < 3; i++) {
            if (board[i] == currentPlayer &&
                board[i + 3] == currentPlayer &&
                board[i + 6] == currentPlayer)
                return true;
        }

        if (board[0] == currentPlayer &&
            board[4] == currentPlayer &&
            board[8] == currentPlayer)
            return true;

        if (board[2] == currentPlayer &&
            board[4] == currentPlayer &&
            board[6] == currentPlayer)
            return true;

        return false;
    }
}