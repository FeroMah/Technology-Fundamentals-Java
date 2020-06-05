package MultipkicationTable;

import java.util.Scanner;

public class MultTab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int conInput = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = i * conInput;
            System.out.println(String.format("%d X %d = %d", conInput, i, result));

        }
    }
}
