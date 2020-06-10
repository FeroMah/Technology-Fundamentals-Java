package HomeWorkExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> text = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            text.add(input.charAt(i));
        }

        int power = 0;
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).equals('>')) {

                if (Character.isDigit(text.get(i + 1))) {
                    power += Integer.parseInt(text.get(i + 1).toString());
                    while (power != 0) {
                        if (!text.get(i + 1).equals('>')) {
                            text.remove(i + 1);
                            power--;
                        } else if (Character.isDigit(text.get(i + 1))) {
                            power += Integer.parseInt(text.get(i + 1).toString());
                        } else break;
                        if (i + 1 == text.size()) {
                            break;
                        }
                    }
                }
            }
        }
        for (Character character : text) {
            System.out.print(character);
        }
    }
}
