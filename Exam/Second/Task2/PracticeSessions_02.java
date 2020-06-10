package PracticalExam_14_04_2019;

import java.util.*;

public class PracticeSessions_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, List<String>> result = new TreeMap<>();


        while (!input.equalsIgnoreCase("End")) {
            String[] data = input.split("->");
            String addMoveClose = data[0].toUpperCase();

            switch (addMoveClose) {
                case "ADD":
                    String roadName = data[1];
                    String racerName = data[2];
                    result.putIfAbsent(roadName, new ArrayList<>());
                    result.get(roadName).add(racerName);

                    break;
                case "MOVE":
                    String currentRoad = data[1];
                    String racer = data[2];
                    String nextRoad = data[3];

                    if (result.get(currentRoad).contains(racer)) {
                        if (result.containsKey(nextRoad)) {
                            result.get(currentRoad).remove(racer);
                            result.get(nextRoad).add(racer);
                        }
                    }

                    break;
                case "CLOSE":
                    String road = data[1];
                    result.remove(road);

                    break;
            }
            input = sc.nextLine();
        }
        System.out.println("Practice sessions:");
        result.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size())).forEach(e -> {
            System.out.println(e.getKey());

            for (String racer : e.getValue()) {
                System.out.println(String.format("++%s", racer));
            }
        });


    }
}
