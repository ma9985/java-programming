package day13_conditional_statements;
/*
Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
 */
public class BooleanOperatorExpression {
    public static void main(String[] args) {
        int number = 65;
        boolean by2 = number % 2 == 0;
        boolean by3 = number % 3 == 0;
        boolean by5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + by2);
        System.out.println(number + " is divisible by 2: " + by3);
        System.out.println(number + " is divisible by 2: " + by5);
    }
}
