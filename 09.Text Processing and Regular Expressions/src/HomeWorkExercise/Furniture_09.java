package HomeWorkExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isItPurchase = sc.nextLine();
        String regex = "^>>(?<item>[A-Za-z]+)<<(?<price>([0-9]+)|([0-9]+[\\.][0-9]+))[!](?<quantity>[0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        List<String> listOfItems = new ArrayList<>();
        double spendMoney = 0.0;
        while (!isItPurchase.equals("Purchase")) {
            Matcher matcher = pattern.matcher(isItPurchase);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                if (price!=0 && quantity != 0) {
                    spendMoney += price * quantity;
                    listOfItems.add(matcher.group("item"));
                }
            }
            isItPurchase = sc.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String item : listOfItems) {
            System.out.println(item);
        }
        System.out.println(String.format("Total money spend: %.2f", spendMoney));
    }

}
