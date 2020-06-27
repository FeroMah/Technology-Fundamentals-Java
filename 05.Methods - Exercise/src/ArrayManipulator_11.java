import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class ArrayManipulator_11 {

    public static void main(String[] args) {

        String[] validCommands = {"exchange","max","min","first","last","end"};

        List<Integer> numbersInput = Arrays.stream(consoleReadNewLine()).map(Integer::parseInt).collect(toList());

        String[] nextCommand = consoleReadNewLine();
        while (!nextCommand[0].equals(validCommands[5])) {
            String s = checkCommand(nextCommand[0], validCommands);
            switch (s){
                case "exchange":
                    List<Integer> swappedArray = doExchange(nextCommand[1], numbersInput);
                    System.out.println(swappedArray);
                    break;
                case "max":
                    break;

            }


            nextCommand = consoleReadNewLine();
        }

    }

    private static List<Integer> doExchange(String position, List<Integer> numbers) {
        int index = Integer.parseInt(position);
        List<Integer> secondPart = numbers.subList(0, index + 1);
        numbers.addAll(secondPart);
        return numbers;

    }

    private static String checkCommand(String command, String[] validCommands) {
        //TODO be fixed
        return Arrays.stream(validCommands).filter(c->c.equals(command)).toArray();
    }

    private static String[] consoleReadNewLine(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toLowerCase().split("\\s+");
    }
}
