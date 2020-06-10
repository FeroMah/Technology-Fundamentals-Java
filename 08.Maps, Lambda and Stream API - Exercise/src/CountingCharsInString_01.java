package ExercisesHomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharsInString_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> word = new LinkedHashMap<>();

        String inputConsole = sc.nextLine();

        for (int i = 0; i < inputConsole.length(); i++) {

            char symbol = inputConsole.charAt(i);
            String letter = String.valueOf(symbol);
            if (!letter.equals(" ")) {
                word.putIfAbsent(letter, 0);
                word.put(letter, word.get(letter) + 1);
            }
        }
        String pattern = "%s -> %d";
        for (Map.Entry<String, Integer> w : word.entrySet()) {
            System.out.println(String.format(pattern, w.getKey(), w.getValue()));
        }
    }
}
