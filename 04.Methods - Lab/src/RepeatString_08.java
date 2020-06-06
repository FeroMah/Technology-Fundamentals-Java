package LectureTasks;

import java.util.Scanner;

public class RepeatString_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatWord(word,count));
    }

    static String repeatWord(String word, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
        }
        return result;
    }
}
