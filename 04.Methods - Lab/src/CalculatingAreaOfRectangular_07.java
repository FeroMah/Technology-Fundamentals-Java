package LectureTasks;

import java.util.Scanner;

public class CalculatingAreaOfRectangular_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println((int) printArea(height, width));
    }

    static double printArea(double height, double width) {
        return height * width;
    }
}