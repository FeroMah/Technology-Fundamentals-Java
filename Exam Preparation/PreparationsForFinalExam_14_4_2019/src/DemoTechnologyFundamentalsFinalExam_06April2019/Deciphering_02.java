package DemoTechnologyFundamentalsFinalExam_06April2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputCode = sc.nextLine();
        StringBuilder message = new StringBuilder();
        String regex = "^[d-z\\{\\}\\|\\#]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputCode);

        boolean hasMatched = false;
        if (matcher.find()) {
            hasMatched = true;
            for (int i = 0; i < inputCode.length(); i++) {
                char symbol = inputCode.charAt(i);
                char newSymbol = (char) (symbol - 3);
                message.append(newSymbol);
            }
        }
        String[] commands = sc.nextLine().split("\\s+");
        String findSubstring = commands[0];
        String replaceWith = commands[1];
        while (message.indexOf(findSubstring) != -1) {
            int startReplaceFrom = message.indexOf(findSubstring);
            int endReplaceTo = findSubstring.length() + startReplaceFrom;
            message.replace(startReplaceFrom, endReplaceTo, replaceWith);
        }
        System.out.println(message);

        if (!hasMatched) {      // default value hasMatched = false;
            System.out.println("This is not the book you are looking for.");
        }
    }
}
