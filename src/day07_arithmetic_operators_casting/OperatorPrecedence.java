package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3); //12
        System.out.println(10 - 5 + 3); //8
        System.out.println(10 - (5 + 3)); //2

        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2 * 2)); //5
        // can't divide by 0

        System.out.println(2 + 5 * 3); //17
        System.out.println((2 + 5) *3); //21

        int num =10;
       // System.out.println(num / 0); //error/exception during RUNTIME. in java uses this vocab
        System.out.println(10 / 3); //--> 3
        System.out.println(5 / 2); // -->2
        //never divide integers/whole numbers
        //use decimal points to number double or float.
        System.out.println(10.0 / 2.0); //5.0
        System.out.println(5.0 / 2.0); //2.5
    }
}
