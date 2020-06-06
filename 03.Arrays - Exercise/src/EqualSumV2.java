import java.util.Arrays;
import java.util.Scanner;

public class EqualSumV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isEqual = false ;
        for (int i = 0; i < arrNumbers.length; i++) {
            int rightSum = 0;
            int leftSum = 0;
            for (int j = i + 1; j < arrNumbers.length; j++) {
                rightSum += arrNumbers[j];
            }
            for (int k = 0; k < i; k++) {
                leftSum += arrNumbers[k];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                isEqual = true;
            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}