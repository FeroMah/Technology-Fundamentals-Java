package LabTasks;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] banedWords = sc.nextLine().split(", ");
        String inputText = sc.nextLine();

        for (String banedWord : banedWords) {
            String replaceAsterisks = "";
            for (int j = 0; j < banedWord.length(); j++) {
                replaceAsterisks += "*";
            }

            while (inputText.contains(banedWord)) {

                inputText = inputText.replace(banedWord, replaceAsterisks);
            }
        }
        System.out.println(inputText);
    }
}
