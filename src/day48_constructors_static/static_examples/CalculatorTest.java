package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        Calculator.add(5,3);

        Calculator calcObject = new Calculator();
        calcObject.multiply(2,4);

        //static method can also be called using an object


    }
}
