package day49_static;

public class StaticTest {
    static String word = "java";
    public static void main(String[] args) {
        // 1. static method can called using classname
        StaticMethods.displayMessage("Wooden spoon");

        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        // 2. static method can only access other static variables and methods
        System.out.println(word);


    }
}
