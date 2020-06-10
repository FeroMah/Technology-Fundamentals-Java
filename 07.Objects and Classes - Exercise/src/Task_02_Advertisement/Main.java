package Task_02_Advertisement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfAdvertisement = Integer.parseInt(sc.nextLine());

        Message message = new Message();

        for (int i = 0; i <numberOfAdvertisement ; i++) {
            System.out.println(message.getRandomMassage());
        }
    }
}
