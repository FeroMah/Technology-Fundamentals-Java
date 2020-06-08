import java.util.Scanner;

public class TopNumber_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();

        printTopNumbers(inputConsole);
    }

    private static void printTopNumbers(String numberInput) {
        int number = Integer.parseInt(numberInput);
        for (int i = 1; i <= number; i++) {
            String currentNumber = String.valueOf(i);
            int sum = getSumDigits(String.valueOf(i));
            if (checkDivisionBy8(sum) && checkOddDigit(currentNumber)) {
                System.out.println(i);
            }
        }
    }

    static int getSumDigits(String input) {
        int sumDigits = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(input.charAt(i)));
            sumDigits += digit;
        }
        return sumDigits;

    }

    static boolean checkDivisionBy8(int input) {
        if (input % 8 == 0) {
            return true;
        }
        return false;
    }

    // Must holds at least one odd digit!!
    static boolean checkOddDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (digit % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
