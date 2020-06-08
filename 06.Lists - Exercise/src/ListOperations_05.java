import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> listOfNumbers = Arrays.stream(sc.nextLine().split(" "))
                .map(String::toString)
                .collect(Collectors.toList());
        String[] inputCommand = sc.nextLine().split(" ");
        String action = inputCommand[0].toUpperCase();

        while (!"END".equalsIgnoreCase(action)) {
            switch (action) {
                case "ADD":
                    String addNumber = inputCommand[1];
                    listOfNumbers.add(addNumber);
                    break;

                case "REMOVE":
                    int removeIndex = Integer.parseInt(inputCommand[1]);
                    int listEndIndex = listOfNumbers.size() - 1;
                    if (removeIndex <= listEndIndex && removeIndex >= 0) {
                        listOfNumbers.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;

                case "SHIFT":
                    String direction = inputCommand[1].toUpperCase();
                    int shiftCount = Integer.parseInt(inputCommand[2]);
                    String bufferContent = "";
                    int count = 0;
                    if ("LEFT".equalsIgnoreCase(direction)) {
                        for (int i = 0; i < listOfNumbers.size(); i++) {
                            bufferContent = listOfNumbers.get(i);
                            listOfNumbers.remove(i);
                            listOfNumbers.add(bufferContent);
                            count++;
                            i--;
                            if (count == shiftCount) {
                                break;
                            }
                        }

                    } else if ("RIGHT".equalsIgnoreCase(direction)) {
                        for (int i = listOfNumbers.size() - 1; i > 0; i--) {
                            bufferContent = listOfNumbers.get(i);
                            listOfNumbers.remove(i);
                            listOfNumbers.add(0, bufferContent);
                            count++;
                            i++;
                            if (count == shiftCount) {
                                break;
                            }
                        }
                    }
                    break;

                case "INSERT":
                    int index = Integer.parseInt(inputCommand[2]);
                    String insertNumb = inputCommand[1];
                    if (!(index < listOfNumbers.size() && index >= 0)) {
                        System.out.println("Invalid index");
                    } else {
                        listOfNumbers.add(index, insertNumb);
                    }
                    break;
            }

            inputCommand = sc.nextLine().split(" ");
            action = inputCommand[0].toUpperCase();
        }
        System.out.println(listOfNumbers.toString()
                .replaceAll("[\\[\\],]", ""));
    }
}
