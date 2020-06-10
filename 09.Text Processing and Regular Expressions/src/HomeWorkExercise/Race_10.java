package HomeWorkExercise;

import java.util.*;

public class Race_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputFirstLine = sc.nextLine().split(", ");
        Map<String, Integer> finishedStatistic = new LinkedHashMap<>();

        for (String name : inputFirstLine) {
            finishedStatistic.putIfAbsent(name, 0);
        }
        String isItEnd = sc.nextLine();
        while (!"end of race".equalsIgnoreCase(isItEnd)) {
            StringBuilder racerName = new StringBuilder();
            int distance = 0;
            for (int i = 0; i < isItEnd.length(); i++) {
                char symbol = isItEnd.charAt(i);

                if (Character.isLetter(symbol)) {
                    racerName.append(symbol);
                } else if (Character.isDigit(symbol)) {
                    distance += Integer.parseInt(String.valueOf(symbol));
                }
            }

            if (finishedStatistic.containsKey(String.valueOf(racerName))) {
                int sumDistance = finishedStatistic.get(String.valueOf(racerName)) + distance;
                finishedStatistic.put(String.valueOf(racerName), sumDistance);
            }
            isItEnd = sc.nextLine();
        }
        List<String> scoreBoard = new ArrayList<>();
        finishedStatistic.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())).limit(3).forEach(e ->
                scoreBoard.add(e.getKey()));

        System.out.println(String.format("1st place: %s",scoreBoard.get(0)));
        System.out.println(String.format("2nd place: %s",scoreBoard.get(1)));
        System.out.println(String.format("3rd place: %s",scoreBoard.get(2)));
    }
}
