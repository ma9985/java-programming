package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10*45 =  " + Calculator.add(10,45));
        System.out.println("multiply 60*60 = " + Calculator.multiply(60,60));
        System.out.println("minus 100-50 = " + Calculator.minus(100,50));

        double d1 = 234.3;
        double d2 = 356.2;
        double result = Calculator.minus(d1, d2);
        System.out.println("results = " + result);
    }
}
