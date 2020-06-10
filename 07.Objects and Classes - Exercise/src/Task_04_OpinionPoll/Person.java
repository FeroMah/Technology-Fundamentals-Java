package Task_04_OpinionPoll;

public class Person {
    private String firstName;
    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return String.format("%s - %d",this.getFirstName(), this.getAge());
    }
}
