package TextProcessingAndRegularExpressions_MoreExercise;

import java.util.*;

public class QueryMess_07_Archive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equalsIgnoreCase("End")) {
            String[] data = input.split("&|\\?");       // or use "[&?]"
            Map<String, List<String>> result = new LinkedHashMap<>();

            for (int i = 0; i < data.length; i++) {
                if (data[i].contains("=")) {
                    String[] data1 = data[i].split("=");
                    String field = data1[0];
                    field = field.replace("+", " ");
                    field = field.replace("%20", " ").trim();
                    field = field.replaceAll("\\s+", " ");
                    String value = data1[1];
                    value = value.replace("+", " ");
                    value = value.replace("%20", " ").trim();
                    value = value.replaceAll("\\s+", " ");

                    result.putIfAbsent(field, new ArrayList<>());
                    result.get(field).add(value);

                }
            }
            result.entrySet().stream().forEach(e -> {
                System.out.print(String.format("%s=%s", e.getKey(), e.getValue()));
            });
            System.out.println();
            input = sc.nextLine();
        }

    }
}
