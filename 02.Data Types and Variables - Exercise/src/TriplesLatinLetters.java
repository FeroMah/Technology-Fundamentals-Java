import java.util.Scanner;

public class TriplesLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 'a'; i < 'a' + num; i++) {
            for (int j = 'a'; j < 'a' + num; j++) {
                for (int k = 'a'; k < 'a' + num; k++) {
                    System.out.print(""+(char) (i) + (char) (j) + (char) (k));
                    System.out.println();
                }
            }
        }
    }
}