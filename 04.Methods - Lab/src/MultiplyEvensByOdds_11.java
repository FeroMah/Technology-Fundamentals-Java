package LectureTasks;

import java.util.Scanner;

public class MultiplyEvensByOdds_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        printMultiplySumOfDigits(input);
    }

    private static void printMultiplySumOfDigits(int input) {
        int sumEven = 0;
        int sumOdd = 0;
        int multiplication = 0;
        String inputString = String.valueOf(input);
        for (int i = 0; i < inputString.length(); i++) {
            char digit = inputString.charAt(i);
            if (inputString.charAt(i) == '-') {
                continue;
            }
            int number = Integer.parseInt(String.valueOf(digit));
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        multiplication = sumEven * sumOdd;
        System.out.println(multiplication);
    }
}