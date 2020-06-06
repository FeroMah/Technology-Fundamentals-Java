import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255; //MAX CAPACITY!!!!!!!
        int waterIn = 0;

        for (int i = 0; i < num; i++) {
            int waterInput = Integer.parseInt(scanner.nextLine());
            if (tankCapacity - waterInput < 0) {
                System.out.println("Insufficient capacity!");
            } else {
                waterIn += waterInput;
                tankCapacity -= waterInput;
            }
        }
        System.out.println(waterIn);
    }
}