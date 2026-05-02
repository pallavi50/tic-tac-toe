import java.util.Scanner;

public class Main {
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();
        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot");
        } else {
            int[] index = convertSlotToIndex(slot);
            System.out.println("Row: " + index[0] + " Column: " + index[1]);
        }
    }
}