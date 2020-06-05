import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = input1; i <= input2; i++) {
            System.out.printf("%d ",i);
            sum+=i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
