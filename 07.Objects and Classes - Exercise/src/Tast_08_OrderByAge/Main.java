package Tast_08_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] consoleInput = sc.nextLine().split("\\s+");
        String programAction = consoleInput[0];

        List<PersonalData> data = new ArrayList<>();

        while (!programAction.equalsIgnoreCase("End")) {
            String name = consoleInput[0];
            String id = consoleInput[1];
            int age = Integer.parseInt(consoleInput[2]);

            PersonalData person = new PersonalData(name, id, age);

            data.add(person);
            consoleInput = sc.nextLine().split("\\s+");
            programAction = consoleInput[0];
        }
        data.stream().sorted(Comparator.comparingInt(PersonalData::getAge))
                .forEach(e -> System.out.println(e.toString()));
    }
}
