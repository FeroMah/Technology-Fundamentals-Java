import java.util.*;

public class ListOfProduction_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberLines = Integer.parseInt(sc.nextLine());
        List<String> shoppingList = new ArrayList<>(numberLines);

        for (int i = 0; i < numberLines; i++) {
            String product = sc.nextLine();
            shoppingList.add(product);
        }
        Collections.sort(shoppingList);
        printProductList(shoppingList);
    }

    static void printProductList(List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            System.out.println(String.format("%d.%s", i + 1, input.get(i)));
        }
    }
}
