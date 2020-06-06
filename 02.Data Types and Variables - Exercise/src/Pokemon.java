import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());   // poke power
        int m = Integer.parseInt(scanner.nextLine());   // distance
        int y = Integer.parseInt(scanner.nextLine());   // exhaustion factor
        int count = 0;
        double halfOriginalN = n * 0.5;
        while (!(n < m)) {
            if (halfOriginalN == n && y>0) {
                    n /= y;
                    continue;
            }
                n -= m;
                count++;
        }
        System.out.println(n);
        System.out.println(count);
    }
}