package TextProcessingAndRegularExpressions_MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("[\\s\\/\\\\\\,\\(\\)]+");
        String usernameValidation = "\\b([A-Za-z][\\w]{2,24})\\b";
        Pattern pattern = Pattern.compile(usernameValidation);

        List<String> validUsernames = new ArrayList<>();
        boolean resultIsNotEmpty = false;

        for (int i = 0; i < input.length; i++) {
            Matcher matcher = pattern.matcher(input[i]);
            if (matcher.find()) {
                validUsernames.add(input[i]);
            }
        }
        String[] bestPair = new String[2];
        int biggestLength = 0;
        for (int i = 0; i < validUsernames.size(); i += 4) {
            int sumFirstPair = validUsernames.get(i).length();
            int sumSecondPair = 0;
            if (i + 1 < validUsernames.size()) {
                sumFirstPair += validUsernames.get(i + 1).length();
                if (i + 2 < validUsernames.size()) {
                    sumSecondPair += validUsernames.get(i + 2).length();
                    if (i + 3 < validUsernames.size()) {
                        sumSecondPair += validUsernames.get(i + 3).length();
                    }
                }
            }
            if (sumFirstPair > sumSecondPair && sumFirstPair > biggestLength) {
                bestPair[0] = validUsernames.get(i);
                bestPair[1] = validUsernames.get(i + 1);
                biggestLength = sumFirstPair;
            } else if (sumFirstPair < sumSecondPair && sumSecondPair > biggestLength) {
                bestPair[0] = validUsernames.get(i + 2);
                bestPair[1] = validUsernames.get(i + 3);
                biggestLength = sumSecondPair;
            }
            resultIsNotEmpty = true;

        }

        for (int i = validUsernames.size() - 1; i > 0; i -= 2) {
            int sumFirstPair = validUsernames.get(i).length();
            int sumSecondPair = 0;
            if (i - 1 > 0) {
                sumFirstPair += validUsernames.get(i - 1).length();
                if (i - 2 > 0) {
                    sumSecondPair += validUsernames.get(i - 2).length();
                    if (i - 3 > 0) {
                        sumSecondPair += validUsernames.get(i - 3).length();
                    }
                }
                if (sumFirstPair > sumSecondPair && sumFirstPair > biggestLength) {
                    bestPair[1] = validUsernames.get(i);
                    bestPair[0] = validUsernames.get(i - 1);
                    biggestLength = sumFirstPair;
                } else if (sumFirstPair < sumSecondPair && sumSecondPair > biggestLength) {
                    bestPair[1] = validUsernames.get(i - 2);
                    bestPair[0] = validUsernames.get(i - 3);
                    biggestLength = sumSecondPair;
                }
            } else {
                break;  // може да има проблем ако има само един валиден потребител
            }
        }
        if (resultIsNotEmpty) {
            System.out.println(bestPair[0]);
            System.out.println(bestPair[1]);
        }
    }
}