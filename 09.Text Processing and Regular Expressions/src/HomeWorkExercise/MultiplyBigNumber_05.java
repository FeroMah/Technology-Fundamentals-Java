package HomeWorkExercise;

import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bigNumInput = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int timesMultiply = Integer.parseInt(sc.nextLine());

        if (timesMultiply == 0 || bigNumInput.charAt(0) == '0') {
            System.out.println(0);
            return;
        }
        int reminder = 0;
        for (int j = bigNumInput.length() - 1; j >= 0; j--) {
            int number = Integer.parseInt(String.valueOf(bigNumInput.charAt(j)));
            int newNumber = number * timesMultiply;

            if (reminder > 0) {
                newNumber += reminder;
                reminder = 0;
            }
            if (newNumber > 9) {
                reminder += newNumber / 10;
                newNumber = newNumber % 10;
            }

            result.insert(0, newNumber);
            if (j == 0 && reminder != 0) {
                String addReminder = String.valueOf(reminder);
                result.insert(0, addReminder.charAt(0));
            }
        }
        System.out.print(result);
    }
}