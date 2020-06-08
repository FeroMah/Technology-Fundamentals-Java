import java.util.Scanner;

public class PasswordValidator_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (!passwordLengthCheck(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersAndDigitsOnly(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!min2Digits(input)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (passwordLengthCheck(input) && lettersAndDigitsOnly(input) && min2Digits(input)) {
            System.out.println("Password is valid");
        }


    }

    static boolean passwordLengthCheck(String input) {
        int size = input.length();
        if (size >= 6 && size <= 10) {
            return true;
        }
        return false;
    }

    static boolean lettersAndDigitsOnly(String input) {
        String inputToLow = input.toLowerCase();
        int counter = 0;
        for (int i = 0; i < inputToLow.length(); i++) {
            char symbol = inputToLow.charAt(i);
            if (((symbol >= 'a' && symbol <= 'z')) || ((symbol >= '0' && symbol <= '9'))) {
                counter++;
            } else return false;
        }
        return true;
    }

    static boolean min2Digits(String input) {
        int numDigits = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                numDigits++;
            } else continue;
        }
        if (numDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
