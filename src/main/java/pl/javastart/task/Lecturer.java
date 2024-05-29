package pl.javastart.task;

public class Lecturer extends Person {
    private static int id;
    private static String degree;

    public Lecturer() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Lecturer.id = id;
    }

    public static String getDegree() {
        return degree;
    }

    public static void setDegree(String degree) {
        Lecturer.degree = degree;
    }

    public void createLecturer(int id, String degree, String firstName, String lastName) {
        Lecturer.setId(id);
        Lecturer.setDegree(degree);
        Person.setFirstName(firstName);
        Person.setLastName(lastName);
    }
}
