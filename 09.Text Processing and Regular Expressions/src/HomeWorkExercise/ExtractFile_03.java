package HomeWorkExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputConsole = sc.nextLine();
        int startPosition = 1 + inputConsole.lastIndexOf('\\');
        String nameAndExtension = inputConsole.substring(startPosition);
        int lastDotPosition = nameAndExtension.lastIndexOf('.');
        String fileName = nameAndExtension.substring(0, lastDotPosition);
        String extension = nameAndExtension.substring(lastDotPosition + 1);

        System.out.println(String.format("File name: %s", fileName));
        System.out.println(String.format("File extension: %s", extension));
    }
}
