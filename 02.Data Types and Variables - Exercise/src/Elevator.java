import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int ups = 0;
        do {
            people -= capacity;
            ups++;
        } while (people > 0);
        System.out.println(ups);
    }
}
