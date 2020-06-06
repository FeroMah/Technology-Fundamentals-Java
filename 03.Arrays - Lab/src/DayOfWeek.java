import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCon = Integer.parseInt(scanner.nextLine());
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (inputCon <= 0 || inputCon > 7) {
            System.out.println("Invalid day!");
        } else {
            int checkDay = inputCon - 1;
            System.out.println(days[checkDay]);
        }
    }
}
