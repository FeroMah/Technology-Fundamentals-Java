import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerson = 0;
        double totalPrice = 0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        pricePerson = 8.45;
                        break;
                    case "Business":
                        pricePerson = 10.90;
                        break;
                    case "Regular":
                        pricePerson = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        pricePerson = 9.80;
                        break;
                    case "Business":
                        pricePerson = 15.60;
                        break;
                    case "Regular":
                        pricePerson = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        pricePerson = 10.46;
                        break;
                    case "Business":
                        pricePerson = 16;
                        break;
                    case "Regular":
                        pricePerson = 22.50;
                        break;


                }
                break;
        }
        if ("Students".equals(type)) {
            if (count >= 30) {
                totalPrice = (pricePerson * count) * 0.85;
            } else {
                totalPrice = pricePerson * count;
            }
        } else if ("Business".equals(type)) {
            if (count >= 100) {
                totalPrice = (count - 10) * pricePerson;
            } else {
                totalPrice = count * pricePerson;
            }
        } else if ("Regular".equals(type)) {
            if (count >= 10 && count <= 20) {
                totalPrice = pricePerson * count * 0.95;
            }else {
                totalPrice = pricePerson * count;
            }
        }
        System.out.println(String.format("Total price: %.2f", totalPrice));
    }
}
