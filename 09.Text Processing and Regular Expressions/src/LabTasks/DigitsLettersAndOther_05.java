package LabTasks;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        String letterResult = "";
        String digitResult = "";
        String symbolResult = "";

        for (int i = 0; i < inputConsole.length(); i++) {
            char currentSymbol = inputConsole.charAt(i);
            if (Character.isAlphabetic(currentSymbol)) {
                letterResult += currentSymbol;
            } else if (Character.isDigit(currentSymbol)) {
                digitResult += currentSymbol;
            } else {
                symbolResult+=currentSymbol;
            }
        }
        System.out.println(digitResult);
        System.out.println(letterResult);
        System.out.println(symbolResult);
    }
}
