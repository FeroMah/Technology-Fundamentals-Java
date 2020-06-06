import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numKegs = Integer.parseInt(scanner.nextLine());
        String result="";
        double biggest=0;

        for (int i = 0; i < numKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;
            if (volume>biggest){
                biggest=volume;
                result=model;
            }
        }
        System.out.println(result);
    }
}
