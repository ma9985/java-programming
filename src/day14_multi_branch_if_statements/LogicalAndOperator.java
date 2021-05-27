package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);  // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

         System.out.println(10 > 5 && 1 == 1); // true
        System.out.println(85 < 99 && 22 > 25); //false
        System.out.println(3 > 2 && 5 > 2); // true

    }

}
