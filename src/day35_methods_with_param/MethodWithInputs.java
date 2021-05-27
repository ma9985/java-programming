package day35_methods_with_param;

public class MethodWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(98);
        int count = 55;
        displayValue(count); //num=count
    }
        public static void displayValue(int num) {
            System.out.println("value is " + num);
    }
    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", im glad to meet you!");
    }

}
