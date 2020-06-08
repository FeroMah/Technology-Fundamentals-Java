import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BombNumbers_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] commandInput = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bombNumber = commandInput[0];
        int power = commandInput[1];

        for (int i = 0; i < listOfNumbers.size(); i++) {    // bomb checking loop
            if (listOfNumbers.get(i) == bombNumber) {       // position of the bomb
                int detonationsCount = 0;
                int leftDetonation = i - power;
                if (leftDetonation < 0) {
                    leftDetonation = 0;
                }
                // remove detonated index in the list
                for (int j = leftDetonation; j < listOfNumbers.size(); j++) {

                    listOfNumbers.remove(j);
                    detonationsCount++;
                    if (detonationsCount == (2 * power) + 1) {
                        break;
                    }
                    j--;
                }
                i = -1; // reset bomb checking loop
            }
        }
        int sum = listOfNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}

