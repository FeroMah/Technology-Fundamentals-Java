package Lists_MoreExercise;


import java.util.Scanner;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputDigits = sc.nextLine().split("\\s+");
        String inputText = sc.nextLine();
        StringBuilder text = new StringBuilder(inputText);
        String result = "";

        for (int i = 0; i < inputDigits.length; i++) {
            int sumOfDigits = 0;
            for (int j = 0; j < inputDigits[i].length(); j++) {
                int digit = Integer.parseInt(String.valueOf(inputDigits[i].charAt(j)));
                sumOfDigits += digit;
            }
            if (sumOfDigits > text.length()) {
                int indexCharToPrint = sumOfDigits % text.length();
                result += text.charAt(indexCharToPrint);
                text.deleteCharAt(indexCharToPrint);
            } else {
                result += text.charAt(sumOfDigits);
                text.deleteCharAt(sumOfDigits);
            }
        }
        System.out.println(result);
    }
}
