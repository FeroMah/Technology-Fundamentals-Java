package ExercisesHomeWork;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, ArrayList<String>> dataStorage = new LinkedHashMap<>();

        String[] consoleInput = sc.nextLine().split(" -> ");
        String isItEnd = consoleInput[0];

        while (!isItEnd.equalsIgnoreCase("End")) {
            String compName = consoleInput[0];
            String userID = consoleInput[1];

            dataStorage.putIfAbsent(compName, new ArrayList<>());

            if (!dataStorage.get(compName).contains(userID)) {

                dataStorage.get(compName).add(userID);
            }


            consoleInput = sc.nextLine().split(" -> ");
            isItEnd = consoleInput[0];
        }

        dataStorage.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey())).forEach(e -> {
            System.out.println(String.format("%s", e.getKey()));

            e.getValue().stream().forEach(h -> System.out.println(String.format("-- %s", h)));
        });
    }
}
