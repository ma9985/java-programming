package day49_static;

public class StaticMethods {

    int num = 10; //non static variable
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
        System.out.println("count: " + count);
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("Wooden spoon");
    }
    //StaticMethods.instanceMethod(); > no
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");


    }

}
