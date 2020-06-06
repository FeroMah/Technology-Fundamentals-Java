import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int minedDays = 0;
        int totalAmount = 0;
        int crew = 26;
        int drops = 10;

        if (startingYield < 100) {
            System.out.println(minedDays);
            System.out.println(totalAmount);
            return;
        }
        do {
            if (startingYield < 100) {
                break;
            }
            totalAmount += startingYield - crew;
            startingYield -= drops;
            minedDays++;
        } while (true);
        System.out.println(minedDays);
        System.out.println(totalAmount - crew);
    }
}
