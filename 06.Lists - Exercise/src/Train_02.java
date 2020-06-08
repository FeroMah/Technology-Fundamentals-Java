import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listOfWagons = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(sc.nextLine());

        String[] operation = sc.nextLine().split(" ");
        String action = operation[0].toUpperCase();

        while (!"END".equalsIgnoreCase(action)) {
            if ("ADD".equals(action)) {// new wagon added with number of passengers!!
                int newWagonAdded = Integer.parseInt(operation[1]);
                listOfWagons.add(newWagonAdded);
            } else {
                int passengerPickedUp = Integer.parseInt(action);
                for (int i = 0; i < listOfWagons.size(); i++) {
                    int isItCrowded = listOfWagons.get(i) + passengerPickedUp;
                    if (isItCrowded <= maxCapacity) {
                        listOfWagons.set(i, isItCrowded);
                        break;
                    }
                }
            }
            operation = sc.nextLine().split(" ");
            action = operation[0].toUpperCase();
        }
        System.out.println(listOfWagons.toString().replaceAll("[\\[\\],]", ""));
    }
}