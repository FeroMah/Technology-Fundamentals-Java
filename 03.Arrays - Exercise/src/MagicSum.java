import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length; i++) {

//              CHECKING FOR PAIRS:

            for (int j = i + 1; j < input.length; j++) {
                int calculation = input[i] + input[j];
                if (number == calculation) {
                    System.out.println(input[i] + " " + input[j]);
                }
            }
        }
    }
}
