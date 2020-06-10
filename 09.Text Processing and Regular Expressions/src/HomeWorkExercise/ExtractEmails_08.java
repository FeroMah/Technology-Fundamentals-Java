package HomeWorkExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();

        String regex = "(^|(?<=\\s))(?<user>[a-z0-9]+[\\.]?[a-z0-9]+[\\-]?[a-z0-9]*[\\.]?)\\@(?<host>[a-z]+[\\-]?[a-z]+[\\.]+[a-z]+[\\.]?[a-z]+)($|(?=.))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputLine);

        while (matcher.find()) {
            System.out.println((matcher.group()));
        }
    }
}
