package PracticalExam_14_04_2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleOfManTTRace_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "^([\\#\\$\\%\\*\\&])(?<name>[A-Za-z]+)\\1[=]+(?<lenght>[0-9]+)!!(?<message>.+)$";
        Pattern pattern = Pattern.compile(regex);
        while (true) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group(2);
                int hashCodeLenght = Integer.parseInt(matcher.group(3));
                String message = matcher.group(4);

                if (message.length() == hashCodeLenght) {
                    StringBuilder resultMessage = new StringBuilder();
                    for (int i = 0; i < message.length(); i++) {
                        char symbol = message.charAt(i);
                        char newSymbol =(char) (hashCodeLenght + symbol);
                        resultMessage.append(newSymbol);
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s", name, resultMessage));
                    return;

                } else {
                    System.out.println("Nothing found!");
                }

            } else {
                System.out.println("Nothing found!");
            }
            input = sc.nextLine();
        }
    }
}
