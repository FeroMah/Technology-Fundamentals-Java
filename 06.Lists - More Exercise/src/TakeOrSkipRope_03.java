package Lists_MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeOrSkipRope_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder inputStr = new StringBuilder();
        List<Character> digitsStr = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digitsStr.add(input.charAt(i));
            } else {
                inputStr.append(input.charAt(i));
            }
        }
        for (int i = 0; i < digitsStr.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(Integer.parseInt(String.valueOf(digitsStr.get(i))));
            } else {
                skipList.add(Integer.parseInt(String.valueOf(digitsStr.get(i))));
            }
        }
        int startPosition = 0;
        for (int i = 0; i < takeList.size(); i++) {
            int endPosition = takeList.get(i);
            for (int j = startPosition; j < startPosition + endPosition; j++) {
                if (j < inputStr.length()) {
                    result += inputStr.charAt(j);
                }
            }
            startPosition += skipList.get(i) + endPosition;
        }
        System.out.println(result);
    }
}