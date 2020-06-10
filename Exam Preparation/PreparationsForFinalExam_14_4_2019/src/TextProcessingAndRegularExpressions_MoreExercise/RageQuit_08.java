package TextProcessingAndRegularExpressions_MoreExercise;

import java.util.Scanner;

public class RageQuit_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        String repeatedStr = "";
        String countOfUniqueSymbols = "";
        StringBuilder finalResultStr = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            String number = "";
            if (Character.isDigit(symbol)) {
                number += symbol;
                if (i + 1 < input.length()) {
                    if (Character.isDigit(input.charAt(i + 1))) {
                        number += input.charAt(i + 1);
                        i++;
                    }
                }
                int parsInt = Integer.parseInt(number);
                for (int j = 0; j < parsInt; j++) {
                    finalResultStr.append(repeatedStr);
                }
                if (parsInt != 0) {
                    for (int j = 0; j < repeatedStr.length(); j++) {
                        char letter = repeatedStr.charAt(j);
                        if (!countOfUniqueSymbols.contains(String.valueOf(letter))) {
                            countOfUniqueSymbols += letter;
                        }
                    }
                }
                repeatedStr = "";

            } else {
                repeatedStr += symbol;
            }
        }
        System.out.println(String.format("Unique symbols used: %d", countOfUniqueSymbols.length()));
        System.out.println(finalResultStr);
    }
}
