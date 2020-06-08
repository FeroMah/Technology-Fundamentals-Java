import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> consoleInput = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int numbOfSums = consoleInput.size() / 2;

        for (int i = 0; i < numbOfSums; i++) {
            int current = consoleInput.get(i) + consoleInput.get(consoleInput.size() - 1);
            consoleInput.set(i, current);
            consoleInput.remove(consoleInput.size() - 1);
        }
        String result = consoleInput.toString().replaceAll("[\\[\\]\\,]", "");
        System.out.println(result);
    }
}
