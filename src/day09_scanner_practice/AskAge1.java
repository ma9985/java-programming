package day09_scanner_practice;
import java.util.Scanner;

public class AskAge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String name = input.next();
        System.out.println(age + " is my exact age! " + "and my name is " + name);
    }
}
