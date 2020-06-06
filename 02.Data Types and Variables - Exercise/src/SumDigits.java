import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDigits = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i <inputDigits.length() ; i++) {
            int currentDigit = Integer.parseInt(String.valueOf(inputDigits.charAt(i)));
            sum+= currentDigit;
        }
        System.out.println(sum);
    }
}