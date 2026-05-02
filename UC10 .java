public class UC10 {
    static char[] board = {'1','2','3','4','5','6','7','8','9'};

    static boolean checkDraw() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }
}