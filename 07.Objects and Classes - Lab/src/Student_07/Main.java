package Student_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String consoleInput = sc.nextLine();

        while (!"end".equals(consoleInput)) {
            String[] input = consoleInput.split(" ");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String city = input[3];

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setAge(age);
                student.setCity(city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }


            consoleInput = sc.nextLine();
        }
        String filterCity = sc.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(filterCity)) {
                System.out.println(String.format("%s %s is %d years old",
                        student.getFirstName(), student.getLastName(), student.getAge()));
            }
        }
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}
