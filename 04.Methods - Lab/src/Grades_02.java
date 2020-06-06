package LectureTasks;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputGrade = Double.parseDouble(scanner.nextLine());
        checkExamGrade(inputGrade);
    }

    static void checkExamGrade(double inputGrade) {
        if (inputGrade >= 2 && inputGrade < 3) {
            System.out.println("Fail");
        } else if (inputGrade >= 3 && inputGrade < 3.5) {
            System.out.println("Poor");
        } else if (inputGrade >= 3.5 && inputGrade < 4.5) {
            System.out.println("Good");
        } else if (inputGrade >= 4.5 && inputGrade < 5.5) {
            System.out.println("Very good");
        } else if (inputGrade >= 5.5 && inputGrade <= 6) {
            System.out.println("Excellent");
        }
    }
}