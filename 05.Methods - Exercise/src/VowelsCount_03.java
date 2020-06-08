import java.util.Scanner;

public class VowelsCount_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printVowelsCount(input);
    }

    static void printVowelsCount(String input) {
        String toLowerCaseAll = input.toLowerCase();
        int vowelsCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = toLowerCaseAll.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    vowelsCounter++;
            }
        }
        System.out.println(vowelsCounter);
        return;
    }
}
