import java.util.Scanner;

public class EqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int count = 1;
        int maxSequence = 0;
        String equalElement = "";
        for (int i = input.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (input[i].equals(input[j])) {
                    count++;
                    if (maxSequence <= count) {
                        maxSequence = count;
                        equalElement = input[i];
                        break;
                    }
                } else {
                    count = 1;
                    break;
                }
            }
        }
        if (maxSequence >= 1) {
            for (int i = 0; i < maxSequence; i++) {
                System.out.print(equalElement + " ");
            }
        } else System.out.print(input[0]);
    }
}
