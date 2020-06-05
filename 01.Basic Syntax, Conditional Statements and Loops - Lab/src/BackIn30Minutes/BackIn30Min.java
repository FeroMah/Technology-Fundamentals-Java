package BackIn30Minutes;

import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int inMinutes = inputHours * 60 + inputMinutes + 30;
        int hh = inMinutes / 60;
        int mm = inMinutes % 60;

        if (hh >= 24) {
            hh = 0;
        }
        System.out.println(String.format("%d:%02d", hh, mm));
    }
}
