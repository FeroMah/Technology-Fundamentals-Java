package SumOfOddNumbers;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputN = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= inputN * 2; i+=2) {
            System.out.println(i);
            sum+=i;
        }
        System.out.printf("Sum: %d", sum);
    }
}
