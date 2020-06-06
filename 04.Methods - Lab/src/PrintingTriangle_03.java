package LectureTasks;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= size; i++) {
            printLine(i);
        }
        for (int i = size-1; i >0 ; i--) {
            printLine(i);
        }
    }

    private static void printLine(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}