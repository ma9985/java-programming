package day34_void_methods;

public class FirstMethod {

    public static void main(String[] args) {
      displayMessage();   // 1st call to method
        displayMessage(); // 2nd call to method
        displayMessage();
        // if u trying to print 100x
        for(int i = 1; i <= 100; i++){
            System.out.println(i+" - ");
            displayMessage();
        }
    }

    //first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends!");


    }
}
