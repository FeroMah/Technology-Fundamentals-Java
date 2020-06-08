import java.util.Scanner;

public class Problem01_PartyProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int partySize = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());
        int coinsTotal = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 15 == 0) {
                partySize += 5;
            }
            if (i % 10 == 0) {
                partySize -= 2;
            }
            int dayProfit = 50 - 2 * partySize;
            if (i % 5 == 0) {
                dayProfit += 20 * partySize;
                if (i % 3 == 0) {
                    dayProfit -= 2 * partySize;
                }
            }
            if (i % 3 == 0) {
                dayProfit -= 3 * partySize;
            }

            coinsTotal += dayProfit;
        }
        int coinsEarned = (coinsTotal / partySize);
        System.out.printf("%d companions received %d coins each.", partySize, coinsEarned);
    }
}
