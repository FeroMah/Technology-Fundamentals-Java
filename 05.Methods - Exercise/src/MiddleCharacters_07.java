import java.util.Scanner;

public class MiddleCharacters_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printMiddleSymbol(input);
    }

    static void printMiddleSymbol(String input) {
        int positionsChar = input.length() - 1;
        if (positionsChar % 2 != 0) {
            int firstSymbol = (positionsChar / 2);
            int secondSymbol = (positionsChar / 2) + 1;
            System.out.print(input.charAt(firstSymbol));
            System.out.println(input.charAt(secondSymbol));
        } else {
            int oneSymbol = input.length() / 2;
            System.out.println(input.charAt(oneSymbol));
        }
    }
}
