import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputConsole = sc.nextLine().split(" ");
        int inputSize = inputConsole.length;
        Random rng = new Random();
        for (int i = 0; i < inputSize; i++) {
            int j = rng.nextInt(inputSize);
            String word = inputConsole[i];
            inputConsole[i] = inputConsole[j];
            inputConsole[j] = word;
        }
        System.out.println(String.join(System.lineSeparator(), inputConsole));
    }
}

