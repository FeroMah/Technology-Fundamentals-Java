package HomeWorkExercise;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bigNumInput = sc.nextLine();
        if (bigNumInput.charAt(0) == '0') {
            System.out.println("true 0=0");
        } else
            System.out.println("false");
    }
}
