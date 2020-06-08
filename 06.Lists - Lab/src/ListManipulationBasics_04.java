import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listOfNumbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(String::toString)
                .collect(Collectors.toList());
        String[] commandInput = sc.nextLine().split("\\s+");
        String action = commandInput[0].toUpperCase();
        do {
            switch (action) {
                case "ADD":
                    String numberAdd = commandInput[1];
                    listOfNumbers.add(numberAdd);
                    break;
                case "REMOVE":
                    String numberRemove = commandInput[1];
                    listOfNumbers.remove(numberRemove);
                    break;

                case "REMOVEAT":
                    int removeAt = Integer.parseInt(commandInput[1]);
                    listOfNumbers.remove(removeAt);
                    break;

                case "INSERT":
                    String inertNumber = commandInput[1];
                    int index = Integer.parseInt(commandInput[2]);
                    listOfNumbers.add(index,inertNumber);
                    break;
            }
            commandInput = sc.nextLine().split("\\s+");
            action = commandInput[0].toUpperCase();


        } while (!"END".equalsIgnoreCase(action));
        System.out.println(listOfNumbers.toString()
                .replaceAll("[\\[\\]\\,]", ""));
    }
}
