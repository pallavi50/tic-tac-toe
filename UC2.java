import java.util.Random;

public class UC2 {

    
    static char userSymbol;
    static char computerSymbol;
    static String currentPlayer;

    
    public static void toss() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        if (tossResult == 0) {
            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            currentPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

       
        System.out.println("Toss Result: " + currentPlayer + " starts first!");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    public static void main(String[] args) {
        toss();
    }
}