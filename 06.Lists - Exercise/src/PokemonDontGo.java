
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputSequence = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumOfRemovedElement = 0;

        while (!inputSequence.isEmpty()) {
            int lastElementIndex = inputSequence.size() - 1;
            int wasRemoved = 0;
            int commandInt = Integer.parseInt(sc.nextLine());

            if (commandInt < 0) {
                int lastElementValue = inputSequence.get(lastElementIndex);
                wasRemoved = inputSequence.get(0);
                sumOfRemovedElement += wasRemoved;
                inputSequence.set(0, lastElementValue);

            } else if (commandInt >= inputSequence.size()) {
                int zeroElementValue = inputSequence.get(0);
                wasRemoved = inputSequence.get(lastElementIndex);
                sumOfRemovedElement += wasRemoved;
                inputSequence.remove(lastElementIndex);
                inputSequence.add(zeroElementValue);

            } else {
                wasRemoved = inputSequence.get(commandInt);
                sumOfRemovedElement += wasRemoved;
                inputSequence.remove(commandInt);

            }
            for (int i = 0; i < inputSequence.size(); i++) {
                if (inputSequence.get(i) <= wasRemoved) {
                    int upByRemoved = inputSequence.get(i) + wasRemoved;
                    inputSequence.set(i, upByRemoved);
                } else if (inputSequence.get(i) > wasRemoved) {
                    int downByRemoved = inputSequence.get(i) - wasRemoved;
                    inputSequence.set(i, downByRemoved);
                }

            }
        }
        System.out.println(sumOfRemovedElement);
    }
}
