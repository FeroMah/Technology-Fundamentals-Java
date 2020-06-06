import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        String result = "";
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 == numbers.length) {
                result += numbers[i];
                break;
            }
            if (numbers[i] > numbers[i + 1]) {
                result += numbers[i] + " ";
            }
        }
        System.out.println(result);
    }
}
