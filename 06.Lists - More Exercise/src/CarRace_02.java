package Lists_MoreExercise;

import java.util.Scanner;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split("\\s+");
        double firstCar = 0;
        double secondCar = 0;
        for (int i = 0; i < inputLine.length / 2; i++) {
            if (Integer.parseInt(inputLine[i]) == 0) {
                firstCar *= 0.8;
            }
            if (Integer.parseInt(inputLine[inputLine.length - 1 - i]) == 0) {
                secondCar*=0.8;
            }
            firstCar += Integer.parseInt(inputLine[i]);
            secondCar += Integer.parseInt(inputLine[inputLine.length - 1 - i]);
        }
        if (firstCar < secondCar) {
            System.out.println(String.format("The winner is left with total time: %.1f", firstCar));
        } else if (firstCar > secondCar) {
            System.out.println(String.format("The winner is right with total time: %.1f", secondCar));
        }
    }
}