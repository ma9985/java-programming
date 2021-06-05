package OffDayCoding;
import java.util.Scanner;

/*
Given two variables num and cost that have been declared and given values,
 write a statement to print the values.

 */
public class DoingSomeVariableScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double cost = input.nextDouble();
        System.out.println("num= " +num);
        System.out.println("cost= " +cost);
    }

}
