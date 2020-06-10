package LabTasks;

import java.util.Scanner;

public class ReversString_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineInput = sc.nextLine();

// Solution with use of StringBuilder;
        while (!lineInput.equalsIgnoreCase("end")) {
            StringBuilder result = new StringBuilder();
            result.append(lineInput).reverse();
            System.out.println(String.format("%s = %s", lineInput, result));
            lineInput = sc.nextLine();
        }
// Solution with for loop from lineInput.length by chars
//        while (!lineInput.equalsIgnoreCase("end")) {
//            String reversedWord = "";
//
//            for (int i = lineInput.length() - 1; i >= 0; i--) {
//                reversedWord += lineInput.charAt(i);
//            }
//            System.out.println(String.format("%s = %s", lineInput, reversedWord));
//            lineInput = sc.nextLine();
//        }
    }
}