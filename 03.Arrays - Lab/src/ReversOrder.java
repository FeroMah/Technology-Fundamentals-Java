import java.util.Scanner;

public class ReversOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRow = Integer.parseInt(scanner.nextLine());
        int[] reversed = new int[numOfRow];
        for (int i = 0; i < numOfRow; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            reversed[reversed.length - 1 - i] = input;
        }
        for (int i = 0; i < reversed.length; i++) {
            if (i != reversed.length - 1) {
                System.out.print(reversed[i] + " ");
            } else System.out.println(reversed[i]);
        }
    }
}