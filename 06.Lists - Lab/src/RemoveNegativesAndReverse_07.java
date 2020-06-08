import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputConsole = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < inputConsole.size(); i++) {
            if (inputConsole.get(i) < 0) {
                inputConsole.remove(i);
                i--;
            }
        }
        Collections.reverse(inputConsole);
        if (inputConsole.size() > 0) {
            System.out.println(inputConsole.toString().replaceAll("[\\[\\],]", ""));
        } else System.out.println("empty");
    }
}
