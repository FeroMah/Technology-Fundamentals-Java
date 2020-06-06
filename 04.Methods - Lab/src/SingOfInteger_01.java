package LectureTasks;

import java.util.Scanner;

public class SingOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        checkNumber(input);
    }

    static void checkNumber(int input) {

        if (input > 0) {
            System.out.println(String.format("The number %d is positive.", input));
        } else if (input < 0) {
            System.out.println(String.format("The number %d is negative.", input));
        } else {
            System.out.println(String.format("The number %d is zero.", input));
        }
    }
}
