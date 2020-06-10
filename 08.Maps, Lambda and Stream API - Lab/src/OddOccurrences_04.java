import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputConsole = sc.nextLine().split("\\s+");

        Map<String, Integer> oddOccurrence = new LinkedHashMap<>();

        for (int i = 0; i < inputConsole.length; i++) {
            String word = inputConsole[i].toLowerCase();
            int count = 0;
            if (oddOccurrence.containsKey(word)) {
                oddOccurrence.put(word, oddOccurrence.get(word) + 1);
            } else {
                oddOccurrence.put(word, count + 1);
            }
        }
        ArrayList<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> kvp : oddOccurrence.entrySet()) {
            if (kvp.getValue() % 2 == 1) {
                oddWords.add(kvp.getKey());
            }
        }

        for (int i = 0; i < oddWords.size(); i++) {
            System.out.print(oddWords.get(i));
            if (i < oddWords.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
