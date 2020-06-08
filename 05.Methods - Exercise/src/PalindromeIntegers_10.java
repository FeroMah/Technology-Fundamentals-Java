import java.util.Scanner;

public class PalindromeIntegers_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        while (!"end".equals(inputConsole.toLowerCase())) {
            System.out.println(checkPalindrome(inputConsole));
            inputConsole = sc.nextLine();
        }
    }

    //  A palindrome is a number which reads the same backward as forward,
    //  such as 323 or 1001.
    static boolean checkPalindrome(String input) {
        String inputRevers = "";
        int lastIndex = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            inputRevers += input.charAt(lastIndex - i);
        }
        if (inputRevers.equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}
