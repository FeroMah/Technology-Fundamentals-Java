package Task_04_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbOfPeople = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numbOfPeople; i++) {
            String[] consoleInput = sc.nextLine().split("\\s+");
            String name = consoleInput[0];
            int age = Integer.parseInt(consoleInput[1]);
            Person person = new Person(name, age);
            people.add(person);
        }
        people.stream().filter(person -> person.getAge() > 30).
                sorted(Comparator.comparing(Person::getFirstName))
                .forEach(System.out::println);
    }
}
