package day09_scanner_practice;
import java.util.Scanner;

public class WholeSaleTobacco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("White Owl:");
        double whiteGrape = scan.nextDouble();

        System.out.println("Swishers: ");
        double swishers = scan.nextDouble();

        System.out.println("Garcia vegas");
        double garciaVegas = scan.nextDouble();

        double total = whiteGrape + swishers + garciaVegas;
        System.out.println("Total: $" + total);
    }
}
