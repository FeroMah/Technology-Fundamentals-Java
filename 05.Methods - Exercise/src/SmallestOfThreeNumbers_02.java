import java.util.Scanner;

public class SmallestOfThreeNumbers_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        printSmallestOfThree(num1, num2, num3);
    }

    static void printSmallestOfThree(int num1, int num2, int num3) {
        int smallestNum = num1;
        if (smallestNum > num2) {
            smallestNum = num2;
        }
        if (smallestNum > num3) {
            smallestNum = num3;
        }
        System.out.println(smallestNum);
        return;
    }
}
