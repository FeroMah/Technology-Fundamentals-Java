package LabTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String regex = "\\b(?<day>\\d{2})(?<separator>[\\/,.-])(?<month>[A-Z][a-z]{2})\\k<separator>(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matchDate = pattern.matcher(input);

        while (matchDate.find()){
            String day = matchDate.group("day");
            String mouth =matchDate.group("month");
            String year= matchDate.group("year");
            System.out.println(String.format("Day: %s, Month: %s, Year: %s",day,mouth,year));
        }
    }
}
