import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=inputNum ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
