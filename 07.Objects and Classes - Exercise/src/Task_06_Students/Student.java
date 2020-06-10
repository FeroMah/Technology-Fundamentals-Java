package Task_06_Students;

public class Student {
    private String firsName;
    private String lastName;
    private double grade;

    public String getFirsName() {
        return this.firsName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    public Student(String firsName, String lastName, double grade) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",
                this.firsName, this.lastName, this.grade);
    }
}
