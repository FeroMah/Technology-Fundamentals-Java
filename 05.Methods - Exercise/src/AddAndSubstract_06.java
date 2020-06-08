import java.util.Scanner;

public class AddAndSubstract_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        int totalSum = calcSum(num1, num2);
        printSubtractResult(totalSum, num3);
    }

    static int calcSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static void printSubtractResult(int sum, int num3) {
        int result = sum - num3;
        System.out.println(result);
        return;
    }
}