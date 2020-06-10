package Task_06_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        List<Student> studentsData = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] inputData = sc.nextLine().split("\\s+");
            String firstName = inputData[0];
            String lastName = inputData[1];
            double grade = Double.parseDouble(inputData[2]);

            Student student = new Student(firstName, lastName, grade);
            studentsData.add(student);
        }
        studentsData.stream()
                .sorted((d1, d2) -> Double.compare(d2.getGrade(), d1.getGrade()))
                .forEach(e -> System.out.println(e.toString()));
    }
}
