package MultipkicationTable;

import java.util.Scanner;

public class MultTab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int conInput1 = Integer.parseInt(scanner.nextLine());
        int conInput2 = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int exseptionResult = conInput1 * conInput2;

        if (conInput1 > 10 || conInput2 > 10) {
            System.out.println(String.format("%d X %d = %d", conInput1, conInput2, exseptionResult));
        } else {
            for (int i=conInput2; i <= 10; i++) {
                result = i * conInput1;
                System.out.println(String.format("%d X %d = %d", conInput1, i, result));

            }
        }
    }

}
