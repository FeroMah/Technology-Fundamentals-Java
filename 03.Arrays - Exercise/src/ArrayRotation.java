import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rotationInput = Integer.parseInt(scanner.nextLine());
        String[] rotationResult = new String[input.length];
//        if (rotationInput == input.length) {                // work without this check (only added for optimal faster work!!!)
//            for (int i = 0; i < input.length; i++) {
//                System.out.print(input[i] + " ");
//            }
//            return;
//        }
        int rotationMod = rotationInput % input.length;     // checks "new" position for rotationalResult[]; change if array.length < rotationInput;
        if (rotationMod == 0) {
            rotationMod = rotationInput;
        }

        for (int i = 0; i < input.length; i++) {
            int indexNew = i - rotationMod;                 // used for index in rotationalResult[];
            if (indexNew < 0) {
                rotationResult[rotationResult.length - Math.abs(indexNew)] = input[i];
            } else {
                rotationResult[indexNew] = input[i];
            }
        }
        for (int i = 0; i < rotationResult.length; i++) {
            System.out.print(rotationResult[i] + " ");
        }
    }
}


