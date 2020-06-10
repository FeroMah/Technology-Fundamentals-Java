import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputConsole = Arrays.stream(sc.nextLine().split("\\s"))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);
        for (String word : inputConsole) {
            System.out.println(word);
        }
    }
}
