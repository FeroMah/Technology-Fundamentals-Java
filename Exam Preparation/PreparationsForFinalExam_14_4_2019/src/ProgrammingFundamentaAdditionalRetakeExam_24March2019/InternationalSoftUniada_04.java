package ProgrammingFundamentaAdditionalRetakeExam_24March2019;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class InternationalSoftUniada_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split(" -> ");
        Map<String, LinkedHashMap<String, Integer>> data = new LinkedHashMap<>();


        while (!inputLine[0].equalsIgnoreCase("End")) {
            String country = inputLine[0];
            String name = inputLine[1];
            int points = Integer.parseInt(inputLine[2]);
            boolean isItUnique = true;

            for (Map.Entry<String, LinkedHashMap<String, Integer>> kvp : data.entrySet()) {
                if (!kvp.getKey().equalsIgnoreCase(country)) {
                    for (var nameAndPoint : kvp.getValue().entrySet()) {

                        if (nameAndPoint.getKey().contains(name)) {
                            isItUnique = false;
                        }
                    }
                }
            }
            if (isItUnique) { // default value true;
                data.putIfAbsent(country, new LinkedHashMap<>());
                data.get(country).putIfAbsent(name, 0);
//            data.get(country).put(name, data.get(country).get(name) + points);
                int newPoints = points + data.get(country).get(name);
                data.get(country).put(name, newPoints);
            }

            inputLine = sc.nextLine().split(" -> ");
        }
        Map<String, Integer> countryResult = new LinkedHashMap<>();
        data.entrySet().forEach(country -> {
            country.getValue().entrySet().forEach(points -> {
                countryResult.putIfAbsent(country.getKey(), 0);
                countryResult.put(country.getKey(), countryResult.get(country.getKey()) + points.getValue());
            });
        });
        countryResult.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue())).forEach(country -> {
            System.out.println(String.format("%s: %d", country.getKey(), country.getValue()));
            data.get(country.getKey()).entrySet().stream()
//                    .sorted((x, z) -> Integer.compare(z.getValue(), x.getValue()))
                    .forEach(g -> System.out.println(String.format(" -- %s -> %d", g.getKey(), g.getValue())));
        });
    }
}
