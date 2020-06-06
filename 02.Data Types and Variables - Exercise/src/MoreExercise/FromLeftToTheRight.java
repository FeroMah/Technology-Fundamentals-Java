package MoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String biggest = "";
        long sum = 0;
        String result = "";
        for (int i = 1; i <= lines; i++) {
            long first = scanner.nextLong();
            long second = scanner.nextLong();
            if (first > second) {
                biggest = "" + first;
            } else biggest = "" + second;
            for (int j = 0; j < biggest.length(); j++) {
                if (biggest.charAt(j)=='-'){
                    continue;
                }
                long num = Integer.parseInt(String.valueOf(biggest.charAt(j)));
                sum += num;
            }
            if (i != lines) {
                result += sum + "\n";
            } else {
                result += sum;
            }
            sum = 0;
        }
        System.out.println(result);
    }
}
