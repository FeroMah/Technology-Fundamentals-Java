import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int biggestDiv = 0;

        if (inputNum % 10 == 0) {
            biggestDiv = 10;
        } else if (inputNum % 7 == 0) {
            biggestDiv = 7;
        } else if (inputNum % 6 == 0) {
            biggestDiv = 6;
        } else if (inputNum % 3 == 0) {
            biggestDiv = 3;
        } else if (inputNum % 2 == 0) {
            biggestDiv = 2;

        }if (biggestDiv ==0){
            System.out.println("Not divisible");
        }else {
            System.out.println(String.format("The number is divisible by %d", biggestDiv));
        }
    }
}