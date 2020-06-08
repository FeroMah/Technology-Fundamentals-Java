import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> input = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(String::toString)
                .collect(Collectors.toList());
        int listSize = input.size();

        String[] commandInput = sc.nextLine().split(" ");
        String action = commandInput[0].toUpperCase();
        while (!"END".equals(action)) {
            switch (action) {
                case "CONTAINS":
                    String number = commandInput[1];
                    if (input.contains(number)) {
                        System.out.println("Yes");
                    } else System.out.println("No such number");
                    break;

                case "PRINT":
                    String type = commandInput[1].toUpperCase();
                    String evenResult = "";
                    String oddResult = "";
                    for (String s : input) {
                        int content = Integer.parseInt(s);
                        if (content % 2 == 0) {
                            evenResult += s + " ";
                        } else oddResult += s + " ";
                    }
                    if (type.equals("EVEN")) {
                        System.out.println(evenResult);
                    }
                    if (type.equals("ODD")) {
                        System.out.println(oddResult);
                    }
                    break;

                case "GET":
                    System.out.println(getSum(input));
                    break;

                case "FILTER":
                    printFiltered(commandInput[1], commandInput[2], input);
                    break;

            }
            commandInput = sc.nextLine().split(" ");
            action = commandInput[0].toUpperCase();
        }
    }

    static int getSum(List<String> list) {
        int sumOfAll = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = Integer.parseInt(list.get(i));
            sumOfAll += number;
        }
        return sumOfAll;
    }

    static void printFiltered(String condition, String numbFiltered, List<String> in) {
        int number = Integer.parseInt(numbFiltered);
        String resultString = "";
        switch (condition) {
            case "<":
                for (int i = 0; i < in.size(); i++) {
                    int numbFromListIn = Integer.parseInt(in.get(i));
                    if (numbFromListIn < number) {
                        resultString += numbFromListIn + " ";
                    }
                }
                break;

            case ">":
                for (int i = 0; i < in.size(); i++) {
                    int numbFromListIn = Integer.parseInt(in.get(i));
                    if (numbFromListIn > number) {
                        resultString += numbFromListIn + " ";
                    }
                }
                break;

            case ">=":
                for (int i = 0; i < in.size(); i++) {
                    int numbFromListIn = Integer.parseInt(in.get(i));
                    if (numbFromListIn >= number) {
                        resultString += numbFromListIn + " ";
                    }
                }
                break;

            case "<=":
                for (int i = 0; i < in.size(); i++) {
                    int numbFromListIn = Integer.parseInt(in.get(i));
                    if (numbFromListIn <= number) {
                        resultString += numbFromListIn + " ";
                    }
                }
                break;
        }
        System.out.println(resultString);
    }
}
