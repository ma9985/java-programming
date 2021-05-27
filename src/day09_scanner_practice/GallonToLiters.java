package day09_scanner_practice;
import java.util.Scanner;

public class GallonToLiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gallon to Liter Conversion");
        System.out.println("Gallons: ");
        double gallons = scan.nextDouble();
        double liters = gallons * 3.785;
        System.out.println(gallons + " in liters is " + liters);




    }

}
