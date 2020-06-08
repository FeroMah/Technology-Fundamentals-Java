import java.util.Scanner;

public class VladoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        while ((b != 0 && a != 0)) {
            if (b == 0 || a == 0) {
                System.out.println("if ");
                break;
            }
            System.out.println("while");
        }
    }
}