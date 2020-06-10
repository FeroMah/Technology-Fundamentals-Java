package HomeWorkExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[2];
        input = sc.nextLine().split("\\s+");

        printCharacterMultiplier(input);
    }

    private static void printCharacterMultiplier(String[] input) {
        int totalSum = 0;
        String shortStr = "";
        String longStr = "";
//        Find shorter and longer strings:
        if (input[0].length() > input[1].length()) {
            shortStr = input[1];
            longStr = input[0];
        } else {
            shortStr = input[0];
            longStr = input[1];
        }
//        Calculation multiplication:
        for (int i = 0; i < shortStr.length(); i++) {
            totalSum += shortStr.charAt(i) * longStr.charAt(i);
        }
        if (shortStr.length() != longStr.length()) {
            for (int i = shortStr.length(); i < longStr.length(); i++) {
                totalSum += longStr.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
