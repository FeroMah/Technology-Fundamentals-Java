import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());

        String searchedGame = sc.nextLine();
        double gamePrice = 0;
        double spend = 0;
        while (!searchedGame.equalsIgnoreCase("Game Time")) {


            switch (searchedGame) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    searchedGame = sc.nextLine();
                    continue;
            }
            if (budget - gamePrice >= 0) {
                budget -= gamePrice;
                spend += gamePrice;
                System.out.println(String.format("Bought %s", searchedGame));
            } else {
                System.out.println("Too Expensive");
            }

            if (budget == 0) {
                System.out.println("Out of money");
               return;
            }
            searchedGame = sc.nextLine();
        }
        System.out.println(String.format("Total spent: $%.2f. Remaining: $%.2f", spend, budget));

    }
}
