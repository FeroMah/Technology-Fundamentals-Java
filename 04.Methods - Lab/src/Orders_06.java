package LectureTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Orders_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println(String.format("%.2f",
                tottalPrice(product, quantity)));
    }

    static double tottalPrice(String product, int quantity) {
        double price = 0;
        switch (product) {
            case "coffee":
                price = 1.5 * quantity;
                break;
            case "water":
                price = 1.0 * quantity;
                break;
            case "coke":
                price = 1.4 * quantity;
                break;
            case "snacks":
                price = 2 * quantity;
                break;
        }
        return price;
    }
}
