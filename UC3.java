import java.util.Scanner;

public class UserSlotInput {

    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot = sc.nextInt();
        return slot;
    }

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("User selected slot: " + slot);
    }
}