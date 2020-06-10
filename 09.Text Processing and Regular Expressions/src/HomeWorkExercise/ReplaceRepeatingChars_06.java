package HomeWorkExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        List<Character> result = new ArrayList<Character>();

        for (int i = 0; i < inputConsole.length(); i++) {
            result.add(inputConsole.charAt(i));
        }
        for (int i = 0; i < result.size(); i++) {
            char uniqueSymbol = result.get(i);
            if (i + 1 == result.size()) {
                break;
            }
            while (uniqueSymbol == result.get(i + 1)) {
                result.remove(i + 1);
                if (i + 1 == result.size()) {
                    break;
                }
            }
        }
        for (Character character : result) {
            System.out.print(character);
        }
    }
}

