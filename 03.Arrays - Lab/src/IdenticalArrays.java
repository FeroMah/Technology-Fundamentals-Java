import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        int size = 0;
        int sum = 0;        // sum of numbers
        if (arr1.length < arr2.length) {
            size = arr1.length;
        } else {
            size = arr2.length;
        }
        for (int i = 0; i < size; i++) {
            if (arr1[i].equals(arr2[i])) {
                int number = Integer.parseInt(arr1[i]);
                sum += number;
            } else {
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", i));
                return;
            }
        }
        System.out.println("Arrays are identical. Sum: " + sum);
    }

}

