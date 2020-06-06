package LectureTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("#.#####");
        double finalResult = powerUpResult(base, power);
        System.out.println(format.format(finalResult));
    }


    static double powerUpResult(double base, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
