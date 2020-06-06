import java.util.Scanner;

public class EvenOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else oddSum += numbers[i];
        }
        System.out.println(evenSum - oddSum);
    }
}
