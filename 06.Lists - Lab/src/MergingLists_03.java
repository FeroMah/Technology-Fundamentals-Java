import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(sc.nextLine().split("\\s"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int smallerListSize = Math.min(listOne.size(), listTwo.size());
        int largerListSize = Math.max(listOne.size(), listTwo.size());
        int lastIndex = smallerListSize;
        for (int i = 0; i < smallerListSize; i++) {
            int numberFromL1 = listOne.get(i);
            result.add(numberFromL1);
            int numberFromL2 = listTwo.get(i);
            result.add(numberFromL2);
        }
        System.out.println(fillRestNumbers(listOne, listTwo, result, largerListSize, lastIndex)
                .toString().replaceAll("[\\[\\],]", ""));

    }

    private static List<Integer> fillRestNumbers(List<Integer> listOne, List<Integer> listTwo, List<Integer> result, int largerListSize, int lastIndex) {
        if (listOne.size() > listTwo.size()) {
            for (int i = lastIndex; i < largerListSize; i++) {
                int number = listOne.get(i);
                result.add(number);
            }

        } else {
            for (int i = lastIndex; i < largerListSize; i++) {
                int number = listTwo.get(i);
                result.add(number);
            }
        }
        return result;
    }
}
