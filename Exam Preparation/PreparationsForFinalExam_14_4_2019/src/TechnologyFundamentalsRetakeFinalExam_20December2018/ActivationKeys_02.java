package TechnologyFundamentalsRetakeFinalExam_20December2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("&");
        List<String> resultKeys = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String regex = "\\b([0-9A-Za-z]{16}|[0-9A-Za-z]{25})\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input[i]);
            if (matcher.find()) {
                if (input[i].length() == 16) {
                    StringBuilder newKey = new StringBuilder();
                    String first = input[i].substring(0, 4) + "-";
                    String second = input[i].substring(4, 8) + "-";
                    String third = input[i].substring(8, 12) + "-";
                    String fourth = input[i].substring(12);
                    newKey.append(first).append(second).append(third).append(fourth);

                    for (int j = 0; j < newKey.length(); j++) {
                        char symbol = newKey.charAt(j);
                        if (Character.isDigit(symbol)) {
                            int newDigit = 9 - Integer.parseInt(String.valueOf(symbol));
                            newKey.replace(j, j + 1, String.valueOf(newDigit));
                        }
                    }
                    resultKeys.add(newKey.toString().toUpperCase());

                } else {
                    StringBuilder newKey = new StringBuilder();
                    String first = input[i].substring(0, 5) + "-";
                    String second = input[i].substring(5, 10) + "-";
                    String third = input[i].substring(10, 15) + "-";
                    String fourth = input[i].substring(15, 20) + "-";
                    String fiveth = input[i].substring(20);
                    newKey.append(first).append(second).append(third).append(fourth).append(fiveth);

                    for (int j = 0; j < newKey.length(); j++) {
                        char symbol = newKey.charAt(j);
                        if (Character.isDigit(symbol)) {
                            int newDigit = 9 - Integer.parseInt(String.valueOf(symbol));
                            newKey.replace(j, j + 1, String.valueOf(newDigit));
                        }
                    }
                    resultKeys.add(newKey.toString().toUpperCase());
                }

            }
        }
        System.out.println(String.join(", ", resultKeys));
    }
}