import java.util.Scanner;

public class CharTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        char end = (char) input;



        for (int i = 'a'; i <= end; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + ", ");
        }
    }
}
