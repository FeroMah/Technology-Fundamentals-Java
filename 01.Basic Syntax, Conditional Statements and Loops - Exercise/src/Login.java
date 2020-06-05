//          Explanation: example:
// String positions: 0 1 2 3
// user name:        f e r o
// revers positions: 3 2 1 0

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String password = "";
        int blockCounter = 0;

        for (int i = user.length() - 1; i >= 0; i--) {
            password += user.charAt(i);

            // System.out.println(password); // for debug purpose only!
        }
        do {
            if (blockCounter == 3) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            String inputPass = scanner.nextLine();
            if (!inputPass.equals(password)) {
                System.out.println("Incorrect password. Try again.");
                blockCounter++;
            } else {
                System.out.printf("User %s logged in.", user);
                break;
            }
        } while (true);
    }
}
