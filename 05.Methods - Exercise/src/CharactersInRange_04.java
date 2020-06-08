import java.util.Scanner;

public class CharactersInRange_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char startSymbol = sc.nextLine().charAt(0);
        char endSymbol = sc.nextLine().charAt(0);

        printCharsBetween(startSymbol, endSymbol);
    }

    static void printCharsBetween(char startSymbol, char endSymbol) {
        char printCurrent;
        char biggestInput;
        if (startSymbol > endSymbol) {
            biggestInput = startSymbol;
            startSymbol = endSymbol;
            endSymbol = biggestInput;
        }
        for (int i = startSymbol + 1; i < endSymbol; i++) {
            printCurrent = (char) i;
            System.out.print(printCurrent + " ");
        }
        return;
    }
}