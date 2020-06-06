import java.util.Scanner;

public class GreaterOfTwoValues_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "int":
                int num1 = Integer.parseInt(sc.nextLine());
                int num2 = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char symbolOne = sc.nextLine().charAt(0);
                char symbolTwo = sc.nextLine().charAt(0);
                System.out.println(getMax(symbolOne, symbolTwo));
                break;
            default:
                String wordOne = sc.nextLine();
                String wordTwo = sc.nextLine();
                System.out.println(getMax(wordOne, wordTwo));
                break;
        }
    }

    static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    static char getMax(char symbolOne, char symbolTwo) {
        if (symbolOne > symbolTwo) {
            return symbolOne;
        }
        return symbolTwo;

    }

    static String getMax(String wordOne, String wordTwo) {
        if (wordOne.compareTo(wordTwo) > 0) {
            return wordOne;
        }
        return wordTwo;

    }
}
