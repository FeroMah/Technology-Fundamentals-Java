package Lists_MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstInput = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondInput = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> comboInput = new ArrayList<>();
        int[] boundryNumbers = new int[2];

        if (firstInput.size() > secondInput.size()) {
            boundryNumbers[0] = Math.min(firstInput.get(firstInput.size() - 1), firstInput.get(firstInput.size() - 2));
            boundryNumbers[1] = Math.max(firstInput.get(firstInput.size() - 1), firstInput.get(firstInput.size() - 2));
            firstInput.remove(firstInput.size() - 2);
            firstInput.remove(firstInput.size() - 1);
        } else if (firstInput.size() < secondInput.size()) {
            boundryNumbers[0] = Math.min(secondInput.get(0), secondInput.get(1));
            boundryNumbers[1] = Math.max(secondInput.get(0), secondInput.get(1));
            secondInput.remove(1);
            secondInput.remove(0);
        }
        for (int i = 0; i < Math.max(firstInput.size(), secondInput.size()); i++) {
            if (i < firstInput.size()) {
                comboInput.add(firstInput.get(i));
            }
            if (secondInput.size() - 1 - i >= 0) {
                comboInput.add(secondInput.get(secondInput.size() - 1 - i));
            }
        }
        Collections.sort(comboInput);
        for (int i = 0; i < comboInput.size(); i++) {
            if (boundryNumbers[0] < comboInput.get(i) && boundryNumbers[1] > comboInput.get(i)) {
                System.out.print(comboInput.get(i) + " ");
            }
        }
    }
}

