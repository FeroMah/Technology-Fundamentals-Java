package ExercisesHomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> archive = new LinkedHashMap<>();
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < number; i++) {
            String[] consoleInput = sc.nextLine().split("\\s+");
            String action = consoleInput[0].toLowerCase();
            String name = consoleInput[1];

            switch (action) {
                case "register":
                    String plateNumber = consoleInput[2].toUpperCase();
                    if (!archive.containsKey(name)) {
                        archive.put(name, plateNumber);
                        System.out.println(String.format("%s registered %s successfully", name, plateNumber));

                    } else {
                        System.out.println(String.format("ERROR: already registered with plate number %s", archive.get(name)));
                    }


                    break;
                case "unregister":
                    if (archive.containsKey(name)) {
                        archive.remove(name);
                        System.out.println(String.format("%s unregistered successfully", name));
                    } else {
                        System.out.println(String.format("ERROR: user %s not found", name));
                    }
                    break;
            }
        }
        archive.forEach((key, value) -> {
            System.out.println(String.format("%s => %s", key, value));
        });
    }
}
