package pl.javastart.task;

public class Person extends UniversityApp {

    static String firstName;
    static String lastName;

    public Person() {
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Person.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Person.lastName = lastName;
    }

    public void printAllStudents() {
        System.out.println(firstName + " " + lastName);
    }
}
