import java.util.Scanner;

public class FactorialDivision_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        long res1 = getFactorial(firstNum);
        long res2 = getFactorial(secondNum);
        double finalResult = getDivide(res1, res2);
        printFormatResult(finalResult);
    }

    static long getFactorial(int number) {
        long result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;

    }

    static double getDivide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    static void printFormatResult(double result) {
        System.out.println(String.format("%.2f", result));
    }
}
