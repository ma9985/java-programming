package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App uberApp = new App(); // creating new object
        //open uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open(); // call open method using object variable
    }
}
