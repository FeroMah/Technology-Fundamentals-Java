import java.util.Scanner;

public class CommenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                if (arr1[j].equals(arr2[i])){
                    System.out.print(arr2[i]+ " ");
                }
            }
        }
    }
}