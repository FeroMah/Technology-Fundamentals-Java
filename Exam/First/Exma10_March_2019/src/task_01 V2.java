import java.util.Scanner;

public class Task_01_HuntingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int people = Integer.parseInt(sc.nextLine());
        double energy = Double.parseDouble(sc.nextLine());
        double waterForPerson = Double.parseDouble(sc.nextLine());
        double foodForPerson = Double.parseDouble(sc.nextLine());


        double watterSupply = waterForPerson * people * days;
        double foodSupply = foodForPerson * people * days;

        double minusFood = 0;
        double minusWater = 0;
        for (int i = 1; i <= days; i++) {
            double energyLost = Double.parseDouble(sc.nextLine());
            energy -= energyLost;

            if (energy <= 0) {

                System.out.println(String.format("You will run out of energy. You will be left with %.2f food and %.2f water.", foodSupply, watterSupply));

                return;
            }
            if (i % 3 == 0) {
                minusFood = foodSupply / people;
                foodSupply = foodSupply - minusFood;
                energy = energy + 0.10 * energy;

            }
            if (i % 2 == 0) {
                energy = energy + 0.05 * energy;
                minusWater = 0.30 * watterSupply;
                watterSupply = watterSupply - minusWater;
            }
        }
        System.out.println(String.format("You are ready for the quest. You will be left with - %.2f energy!", energy));
    }
}
