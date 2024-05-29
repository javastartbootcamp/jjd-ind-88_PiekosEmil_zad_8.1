package pl.javastart.task;

public class Group extends UniversityApp {
    private static String code;
    private static String name;
    private static int lecruterId;

    public Group() {
    }

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        Group.code = code;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Group.name = name;
    }

    public static int getLecruterId() {
        return lecruterId;
    }

    public static void setLecruterId(int lecruterId) {
        Group.lecruterId = lecruterId;
    }

    public void createGroup(String code, String name, int lecturerId) {
        Group.setCode(code);
        Group.setName(name);
        Group.setLecruterId(lecruterId);
    }

    public static String groupInfo(String groupCode) {
        return Group.getCode() + " " + Group.getName() + " " + Group.getLecruterId();
    }
}
