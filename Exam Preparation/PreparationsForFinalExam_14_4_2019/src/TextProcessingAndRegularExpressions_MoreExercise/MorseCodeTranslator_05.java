package TextProcessingAndRegularExpressions_MoreExercise;

import java.util.Scanner;

public class MorseCodeTranslator_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\|");
      StringBuilder result= new StringBuilder();


        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?"};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};
        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split("\\s+");
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < morse.length; k++) {
                    if (morse[k].equalsIgnoreCase(data[j])) {
                        result.append(english[k]);
                    }
                }
            }
            result.append(" ");
        }
        System.out.println(result.toString().toUpperCase());
    }
}
