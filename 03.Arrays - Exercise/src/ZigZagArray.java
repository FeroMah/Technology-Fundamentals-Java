import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbOfElements = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[numbOfElements * 2];
        String oddPosition = "";
        String evenPosition = "";
        int index = 0;
        for (int i = 0; i < numbOfElements; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                numbers[index++] = input[0];
                numbers[index++] = input[1];
            } else {
                numbers[index++] = input[1];
                numbers[index++] = input[0];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                evenPosition += numbers[i] + " ";
            } else
                oddPosition += numbers[i] + " ";
        }
        System.out.println(evenPosition);
        System.out.println(oddPosition);
    }
}
