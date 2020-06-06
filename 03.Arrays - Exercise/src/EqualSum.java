import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            if (i + 1 == input.length) {
                if (input.length == 1)
                    System.out.println("0");
                return;
            } else {
                if (i == 0) {
                    sumLeft += input[i] + input[i + 1];
                } else {
                    sumLeft += input[i];
                }
                for (int j = input.length - 1; j > i; j--) {
                    sumRight += input[j];
                    if (sumLeft == sumRight) {
                        for (int k = 0; k < input.length; k++) {
                            if (input[j] == input[k] && k < j) {
                                index = k;
                                System.out.println(index);
                                return;
                            } else index = j;
                        }
                    }
                }
            }
        }
        if (index == 0) {
            System.out.println("no");
        } else {
            System.out.println(index);
        }
    }
}
