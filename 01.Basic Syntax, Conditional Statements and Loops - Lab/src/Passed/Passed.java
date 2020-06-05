package Passed;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputGrade = Double.parseDouble(scanner.nextLine());

        if (inputGrade >= 3.00) {
            System.out.println("Passed!");
        }else
            System.out.println("Failed!");
    }
}