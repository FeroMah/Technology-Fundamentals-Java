import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> inputConsole = Arrays.stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt).sorted((p1, p2) -> p2.compareTo(p1)).limit(3).collect(Collectors.toList());
        String result = "";
        for (Integer integer : inputConsole) {
            result += integer + " ";
        }
        System.out.println(result.trim());

    }
}