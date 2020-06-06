import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int size = input.length;
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        while (size != 1) {         // can be used "fori" instead "while" loop {{ for (i = input.length ; i > 0 ; i--) }}
            for (int i = 0; i < numbers.length - 1; i++) {
                int[] small = new int[input.length - 1];
                small[i] = numbers[i] + numbers[i + 1];
                numbers[i] = small[i];
            }
            size--;
        }
        System.out.println(numbers[0]);
    }
}
