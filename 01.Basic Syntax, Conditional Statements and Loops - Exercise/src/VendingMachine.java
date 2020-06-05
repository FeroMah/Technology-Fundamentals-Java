import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String snaks = "";
        double money = 0.0;
        double snaksPrice = 0.0;
        do {
            String input = scanner.nextLine();
            if ("Start".equals(input)) {
                break;
            }
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1.0 || coin == 2.0) {
                money += coin;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);
            }
        } while (true);

        do {
            snaks = scanner.nextLine();
            if (("End".equals(snaks))) {
                break;
            }
            switch (snaks) {
                case "Nuts":
                    snaksPrice = 2.0;
                    break;
                case "Water":
                    snaksPrice = 0.7;
                    break;
                case "Crisps":
                    snaksPrice = 1.5;
                    break;
                case "Soda":
                    snaksPrice = 0.8;
                    break;
                case "Coke":
                    snaksPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (money < snaksPrice) {
                System.out.println("Sorry, not enough money");
            } else if (("Coke".equals(snaks)) || ("Soda".equals(snaks)) || ("Nuts".equals(snaks)) || ("Water".equals(snaks)) || ("Crisps".equals(snaks))) {
                System.out.println(String.format("Purchased %s", snaks));
                money = money - snaksPrice;
            }
        }
        while (true);
        System.out.println(String.format("Change: %.2f", money));
    }
}

