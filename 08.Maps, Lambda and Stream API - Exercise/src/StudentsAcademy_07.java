package ExercisesHomeWork;

import java.util.*;

public class StudentsAcademy_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        Map<String, ArrayList<Double>> scoreBook = new LinkedHashMap<>();
        Map<String, Double> result = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String name = sc.nextLine();
            double score = Double.parseDouble(sc.nextLine());

            scoreBook.putIfAbsent(name, new ArrayList<>());
            scoreBook.get(name).add(score);

        }
        scoreBook.entrySet().stream().forEach(e -> {

            e.getValue().stream().forEach(h -> {
                double sumScores = 0;
                double average = 0;

                for (Double aDouble : e.getValue()) {
                    sumScores += aDouble;
                }
                average = sumScores / e.getValue().size();

                result.putIfAbsent(e.getKey(), average);

            });
        });
        result.entrySet().stream().sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .filter(c -> c.getValue() >= 4.50)
                .forEach(m -> System.out.println(String.format("%s -> %.2f", m.getKey(), m.getValue())));

    }

}



