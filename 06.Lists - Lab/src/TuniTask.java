import java.util.Scanner;

public class TuniTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalSpirit = 0;
        int totalCost = 0;
        for (int i = 1; i <= days; i++) {

            if (i % 11 == 0) {
                quantity += 2;
            }
            if (i % 10 == 0) {
                totalSpirit -= 20;
                totalCost += 5 + 3 + 15;
//                if (i == 10) {
//                    totalSpirit -= 30;
//                }
            }
            if (i % 5 == 0) {
                totalCost += 15 * quantity;
                totalSpirit += 17;
                if (i % 3 == 0) {
                    totalSpirit += 30;
                }
            }
            if (i % 3 == 0) {
                totalCost += 5 * quantity + 3 * quantity;
                totalSpirit += 13;
            }
            if (i % 2 == 0) {
                totalCost += 2 * quantity;
                totalSpirit += 5;
            }
        }
        if (days%10==0){
            totalSpirit-=30;
        }
        System.out.println("Total cost: " + totalCost);
        System.out.println("Total spirit: " + totalSpirit);

    }
}