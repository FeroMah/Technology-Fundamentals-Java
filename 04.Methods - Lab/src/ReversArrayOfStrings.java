import java.util.Scanner;

public class ReversArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] reversed = new String[input.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = input[input.length - 1 - i];
            System.out.print(reversed[i] + " ");
        }
    }
}
