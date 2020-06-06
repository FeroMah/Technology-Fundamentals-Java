package LectureTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        int num2 = Integer.parseInt(sc.nextLine());
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(calculate(num1,operator,num2)));
    }

    private static double calculate(int num1, char operator, int num2) {
        double result = 0.0;
        switch (operator) {
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
        }
        return result;
    }
}
