package ExercisesHomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Integer> yield = new LinkedHashMap<>();

        while (!input.equalsIgnoreCase("Stop")) {
            String typeOre = input;
            int quantity = Integer.parseInt(sc.nextLine());

            if (!yield.containsKey(typeOre)) {
                yield.put(typeOre, quantity);
            } else {
                yield.put(typeOre, yield.get(typeOre) + quantity);
            }

            input = sc.nextLine();
        }
        for (Map.Entry<String, Integer> y : yield.entrySet()) {
            System.out.println(String.format("%s -> %d", y.getKey(), y.getValue()));
        }
    }
}
