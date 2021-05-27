package OfficeHours.OfficeHours_04_19_2021;

public class MethodClass {
    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne() {
        System.out.println("One");
    }

    public static String methodTwo() {
        return "Two";
    }

    public static int methodThree(String word) {
        return word.length();
    }

    public static boolean login(String username, String password) {
        return true;
    }
}
