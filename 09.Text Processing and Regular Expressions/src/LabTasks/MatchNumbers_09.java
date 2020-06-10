package LabTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNumbers_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> resultListValidNumbs = new LinkedList<>();
        String input = sc.nextLine();
        String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";
        Pattern pattern = Pattern.compile(regex);
        Matcher validNumbs = pattern.matcher(input);

        while (validNumbs.find()) {
            resultListValidNumbs.add(validNumbs.group());
        }
        System.out.println(String.join(" ", resultListValidNumbs));
    }
}
