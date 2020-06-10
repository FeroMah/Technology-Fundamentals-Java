package ExercisesHomeWork;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, ArrayList<String>> archive = new LinkedHashMap<>();

        String[] consoleInput = sc.nextLine().split(" : ");
        String isItEnd = consoleInput[0];
        while (!isItEnd.equalsIgnoreCase("end")) {

            String module = consoleInput[0];
            String studentName = consoleInput[1];

            archive.putIfAbsent(module, new ArrayList<>());
            archive.get(module).add(studentName);


            consoleInput = sc.nextLine().split(" : ");
            isItEnd = consoleInput[0];
        }
        archive.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));
            e.getValue().stream().sorted().forEach(h -> System.out.println(String.format("-- %s", h)));
        });
    }
}


