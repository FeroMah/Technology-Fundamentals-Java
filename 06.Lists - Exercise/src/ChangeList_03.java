import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> consoleInput = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(String::toString)
                .collect(Collectors.toList());
        consoleInput.toString().trim();

        String[] commandInput = sc.nextLine().split("\\s+");
        String action = commandInput[0].toUpperCase();

        while (!"END".equalsIgnoreCase(action)) {

            switch (action) {
                case "DELETE":
                    String delNumber = commandInput[1];
                    for (int i = 0; i < consoleInput.size(); i++) {
                        if (consoleInput.get(i).equals(delNumber)) {
                            consoleInput.remove(i);
                            i--;
                        }
                    }

                    break;
                case "INSERT":
                    int listLastIndex = consoleInput.size() - 1;
                    String element = commandInput[1];
                    int position = Integer.parseInt(commandInput[2]);
                    if (position <= listLastIndex && position >= 0) {
                        consoleInput.add(position, element);
                    }
                    break;
            }
            commandInput = sc.nextLine().split("\\s+");
            action = commandInput[0].toUpperCase();
        }
        System.out.println(consoleInput.toString().replaceAll("[\\[\\],]", "").trim());
    }
}
