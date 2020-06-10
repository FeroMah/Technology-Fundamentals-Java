package HomeWorkExercise;

import java.util.Scanner;

public class CaeserCipher_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <inputConsole.length() ; i++) {
            char symbol= (char)(inputConsole.charAt(i) + 3);
            result.append(symbol);
        }
        System.out.println(result);
    }
}
