package LabTasks;

import java.util.Scanner;

public class RepeatString_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String n : input) {
            for (int i = 0; i < n.length(); i++) {
                result.append(n);
            }
        }
        System.out.println(result);
    }
}

//  This is first alternative solution
//        for (int i = 0; i < input.length; i++) {
//            for (int j = 0; j < input[i].length(); j++) {
//                System.out.print(input[i]);
//            }
//        }
