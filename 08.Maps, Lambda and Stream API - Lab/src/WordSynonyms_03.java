import java.util.*;

public class WordSynonyms_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        int number = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < number; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> kvp : words.entrySet()) {
            String key = kvp.getKey();
            String value = String.join(", ", kvp.getValue());

            System.out.println(String.format("%s - %s",key,value));
        }
    }
}

