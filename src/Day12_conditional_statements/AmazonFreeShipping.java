package Day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price");
        double totalPrice = scan.nextDouble();

        if(totalPrice >= 25) {
            System.out.println("Free shipping eligible. your order total price : $" + totalPrice);
        }else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. YOUR ORDER TOTAL IS: $" + totalPrice);
        }
        System.out.println("Thank you for shopping at Amazon");


    }
}
