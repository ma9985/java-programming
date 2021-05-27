package day14_multi_branch_if_statements;
import java.util.Scanner;

public class Midpoiont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int count = word.length();
        if(word.length() % 2 ==0 || count < 5){
            System.out.println("invalid");
        }else {
            int midPoint = count /2;
            System.out.println(word.substring(midPoint -1, midPoint +2));
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        System.out.println("Medium value is: " + num2);
    }


}
