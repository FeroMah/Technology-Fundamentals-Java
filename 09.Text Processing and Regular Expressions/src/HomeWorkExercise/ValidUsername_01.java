package HomeWorkExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsername_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputConsole = sc.nextLine().split(", ");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < inputConsole.length; i++) {
            if (inputConsole[i].length() >= 3 && inputConsole[i].length() <= 16) {

                List<Character> midBuffer = new ArrayList<>();
                for (int j = 0; j < inputConsole[i].length(); j++) {
                    char symbol = inputConsole[i].charAt(j);


                    if ('-' == symbol) {
                        if (midBuffer.contains(symbol)) {
                            break;
                        } else {
                            midBuffer.add(symbol);
                        }

                    } else if ('_' == symbol) {
                        if (midBuffer.contains(symbol)) {
                            break;
                        } else {
                            midBuffer.add(symbol);
                        }
                    } else if (Character.isLetter(symbol)) {
                        midBuffer.add(symbol);
                    } else if (Character.isDigit(symbol)) {
                        if (midBuffer.contains(symbol)) {
                            break;
                        } else {
                            midBuffer.add(symbol);
                        }
                    }
                }
                if (midBuffer.size() == inputConsole[i].length()) {
                    String userName = "";
                    for (Character character : midBuffer) {
                        userName += character;
                    }
                    result.add(userName);
                }
            }
        }
        for (String res : result) {
            System.out.println(res);
        }
    }
}