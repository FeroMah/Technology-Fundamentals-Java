package TheatrePromotions;

import java.util.Scanner;

public class Promotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 0 || age > 122) {
            System.out.println("Error!");

        } else {
            switch (typeOfDay) {
                case "Weekday":
                    if (0 <= age && age <= 18) {
                        System.out.println("12$");
                    } else if (18 < age && age <= 64) {
                        System.out.println("18$");
                    } else if (age > 64 && age <= 122) {
                        System.out.println("12$");
                    }
                    break;
                case "Weekend":
                    if (0 <= age && age <= 18) {
                        System.out.println("15$");
                    } else if (18 < age && age <= 64) {
                        System.out.println("20$");
                    } else if (age > 64 && age <= 122) {
                        System.out.println("15$");
                    }
                    break;
                case "Holiday":
                    if (0 <= age && age <= 18) {
                        System.out.println("5$");
                    } else if (18 < age && age <= 64) {
                        System.out.println("12$");
                    } else if (age > 64 && age <= 122) {
                        System.out.println("10$");
                    }
                    break;
            }
        }
    }
}
