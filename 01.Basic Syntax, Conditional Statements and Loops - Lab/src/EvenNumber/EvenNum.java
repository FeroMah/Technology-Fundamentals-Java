package EvenNumber;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            int inputNum = Integer.parseInt(scanner.nextLine());
            if (inputNum % 2 !=0){
                System.out.println("Please write an even number.");
            }else {
                System.out.printf("The number is: %d",Math.abs(inputNum));
                break;
            }
        }while (true);
    }
}
