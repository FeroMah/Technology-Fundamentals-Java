package ExercisesHomeWork;

import java.util.*;


public class Orders_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String, double[]> products = new LinkedHashMap<>();
        Map<String, Double> result = new LinkedHashMap<>();

        String[] consoleInput = sc.nextLine().split("\\s+");
        String areYouBuy = consoleInput[0];

        double oldQuantity = 0.0;
        while (!areYouBuy.equalsIgnoreCase("buy")) {
            String productName = areYouBuy;
            double singlePrice = Double.parseDouble(consoleInput[1]);
            double quantity = Double.parseDouble(consoleInput[2]);

            products.putIfAbsent(productName, new double[2]);
            products.get(productName)[0] = singlePrice;
            oldQuantity = products.get(productName)[1];
            products.get(productName)[1] = quantity + oldQuantity;


            consoleInput = sc.nextLine().split("\\s+");
            areYouBuy = consoleInput[0];
        }
        for (Map.Entry<String, double[]> kvp : products.entrySet()) {
            String product = kvp.getKey();
            double priceForOne = kvp.getValue()[0];
            double totalQuantity = kvp.getValue()[1];
            double totalPrice = totalQuantity * priceForOne;
            result.putIfAbsent(product, totalPrice);
            result.put(product, totalPrice);
        }
        result.entrySet().stream()
                .forEach(e -> System.out.println(String.format("%s -> %.2f", e.getKey(), e.getValue())));

    }

}

