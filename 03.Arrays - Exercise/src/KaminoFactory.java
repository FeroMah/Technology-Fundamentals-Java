import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthDNA = Integer.parseInt(sc.nextLine());
        int sequence = 0;
        int newSequence = 0;
        int bestSequence = 0;
        int newFirstIndex = 0;
        int bestFirstIndex = 0;
        int bestCounterOfOnes = 0;
        String[] bestDNA = new String[lengthDNA];

        String[] inputDNA = sc.nextLine().split("\\!+");
        String isItTimeToClone = inputDNA[0];

        while (!isItTimeToClone.equalsIgnoreCase("Clone them")) {
            int counterOfOnes = 0;
            for (int i = 0; i < lengthDNA; i++) {
                if (inputDNA[i].equalsIgnoreCase("1")) {
                    sequence++;
                    counterOfOnes++;
                } else {
                    if (sequence > newSequence) {
                        newSequence = sequence;
                        newFirstIndex = i - newSequence;


                    }
                    sequence = 0;
                }
            }
            if (newSequence >= bestSequence) {
                bestSequence = newSequence;
                if (newFirstIndex < bestFirstIndex) {
                    bestFirstIndex = newFirstIndex;
                    if (counterOfOnes > bestCounterOfOnes) {
                        bestCounterOfOnes = counterOfOnes;
                        for (int j = 0; j < lengthDNA; j++) {
                            bestDNA[j] = inputDNA[j] + " ";
                        }
                    }
                }
            }


            inputDNA = sc.nextLine().split("\\!+");
            isItTimeToClone = inputDNA[0];
        }


    }
}
