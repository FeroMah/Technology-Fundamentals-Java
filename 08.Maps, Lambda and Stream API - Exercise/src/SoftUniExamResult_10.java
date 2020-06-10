package ExercisesHomeWork;

import java.util.*;

public class SoftUniExamResult_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoleInput = sc.nextLine().split("-");
        String isItFinished = consoleInput[0];

        Map<String, ArrayList<String>> techStudents = new TreeMap<>();
        Map<String, ArrayList<Integer>> scoreArchive = new TreeMap<>();
        Map<String, Integer> scoreBoard = new TreeMap<>();

        while (!isItFinished.equalsIgnoreCase("exam finished")) {

            String name = consoleInput[0];
            String tech = consoleInput[1];

            if (!tech.equalsIgnoreCase("banned")) {
                int score = Integer.parseInt(consoleInput[2]);

                techStudents.putIfAbsent(tech, new ArrayList<>());
                techStudents.get(tech).add(name);

                scoreArchive.putIfAbsent(name, new ArrayList<>());
                scoreArchive.get(name).add(score);
            } else {

                scoreArchive.remove(name);
            }


            consoleInput = sc.nextLine().split("-");
            isItFinished = consoleInput[0];
        }


// Find MAX scores for student:
        for (Map.Entry<String, ArrayList<Integer>> kvp : scoreArchive.entrySet()) {
            int maxValue = 0;
            for (Integer scoreF : kvp.getValue()) {
                if (maxValue < scoreF) {
                    maxValue = scoreF;
                }
            }
            scoreBoard.put(kvp.getKey(), maxValue);
        }
        System.out.println("Results:");

        scoreBoard.entrySet().stream().sorted((n, m) -> Integer.compare(m.getValue(), n.getValue()))
                .forEach(e -> System.out.println(String.format("%s | %d", e.getKey(), e.getValue())));

        System.out.println("Submissions:");

        techStudents.entrySet().stream().sorted((k, l) -> Integer.compare(l.getValue().size(), k.getValue().size()))
                .forEach(z -> System.out.println(String.format("%s - %d", z.getKey(), z.getValue().size())));
        System.out.println();
    }
}
