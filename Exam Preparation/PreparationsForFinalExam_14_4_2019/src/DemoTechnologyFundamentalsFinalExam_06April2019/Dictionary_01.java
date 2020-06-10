package DemoTechnologyFundamentalsFinalExam_06April2019;

import java.util.*;

public class Dictionary_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> dictionary = new TreeMap<>();

        String[] inputConsole = sc.nextLine().split(" \\| ");

        for (int i = 0; i < inputConsole.length; i++) {
            String[] data = inputConsole[i].split(": ");

            String word = data[0];

            String definition = data[1]; //may not have definition!!
            dictionary.putIfAbsent(word, new ArrayList<>());
            dictionary.get(word).add(definition);
        }
        inputConsole = sc.nextLine().split(" \\| ");

        for (int i = 0; i < inputConsole.length; i++) {
            String checkWord = inputConsole[i];

            dictionary.entrySet().stream().forEach(e -> {
                if (e.getKey().equalsIgnoreCase(checkWord)) {
                    System.out.println(e.getKey());
                    e.getValue().stream().sorted((a, b) -> Integer.compare(b.length(), a.length())).forEach(z -> System.out.println(String.format(" -%s", z)));
                }
            });
        }
        String command = sc.nextLine();
        if (command.equalsIgnoreCase("List")) {
            dictionary.keySet().stream().forEach(e -> {         //don't need to add .sorted(), because dictionary is a TreeMap;
                System.out.print(String.format("%s ", e));
            });
        }
    }
}

