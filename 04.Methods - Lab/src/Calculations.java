package LectureTasks;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        switch (operation){
            case "add":
                add(num1,num2);
                break;
            case "multiply":
                multiply(num1,num2);
                break;
            case "subtract":
                subtract(num1,num2);
                break;
            case "divide":
                divide(num1,num2);
                break;
        }

    }

    static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

    static void multiply(int num1, int num2) {
        int result = num1 * num2;
        System.out.println(result);
    }

    static void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(result);
    }static  void divide(int num1,int num2){
        int result = num1/num2;
        System.out.println(result);
    }
}
