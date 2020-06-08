package Lists_MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSetDefaultInput = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumSetInitialQuality = new ArrayList<>(drumSetDefaultInput);
        String isItHitItAgainGabsy = scanner.nextLine();
        while (!isItHitItAgainGabsy.equalsIgnoreCase("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(isItHitItAgainGabsy);
            for (int i = 0; i < drumSetInitialQuality.size(); i++) {
                int newDrum = drumSetInitialQuality.get(i) - hitPower;
                if (newDrum <= 0) {
                    if (drumSetDefaultInput.get(i) * 3 <= savings) {
                        savings -= drumSetDefaultInput.get(i) * 3;
                        newDrum = drumSetDefaultInput.get(i);
                        drumSetInitialQuality.set(i, newDrum);
                    } else {
                        drumSetInitialQuality.remove(i);
                        drumSetDefaultInput.remove(i);
                        i--;                            //go back by "1" to not to skip next "i" count;
                    }
                } else {
                    drumSetInitialQuality.set(i, newDrum);
                }
            }
            isItHitItAgainGabsy = scanner.nextLine();
        }
        for (int i = 0; i < drumSetInitialQuality.size(); i++) {
            if (i < drumSetInitialQuality.size() - 1) {
                System.out.print(drumSetInitialQuality.get(i) + " ");
            } else System.out.print(drumSetInitialQuality.get(i));

        }
        System.out.println();
        System.out.println(String.format("Gabsy has %.2flv.", savings));
    }
}

