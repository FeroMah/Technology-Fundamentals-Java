import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountChars = Integer.parseInt(scanner.nextLine());
        int sumASCII = 0;

        for (int i = 1; i <= amountChars; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sumASCII += symbol;
        }
        System.out.println("The sum equals: " + sumASCII);
    }
}
