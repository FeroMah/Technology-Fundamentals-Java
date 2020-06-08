import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> consoleInput = Arrays.stream(sc.nextLine().split("\\|+"))
                .collect(Collectors.toList());
        Collections.reverse(consoleInput);
        System.out.println(consoleInput
                .toString().replaceAll("[\\[\\],]", "")
                .replaceAll("\\s+", " ").trim());
    }
}
