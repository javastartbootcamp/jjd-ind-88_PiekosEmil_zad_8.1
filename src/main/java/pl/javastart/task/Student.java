package pl.javastart.task;

public class Student extends Person {
    private static int index;
    private Group code;

    public Student() {

    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Student.index = index;
    }

    public Group getCode() {
        return code;
    }

    public void setCode(Group code) {
        this.code = code;
    }

    public void addStudentToGroup(int index, String groupCode, String firstName, String lastName) {
        Student.setIndex(index);
        Group.setCode(groupCode);
        Person.setFirstName(firstName);
        Person.setLastName(lastName);
    }

    public static String studentInfo() {
        return getIndex() + " " + getFirstName() + " " + getLastName();
    }
}
