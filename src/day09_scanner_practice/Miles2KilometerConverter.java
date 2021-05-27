package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KilometerConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("############ MILES TO KM CONVERTER ############");
        System.out.println("Enter miles");
        //double miles = 10.0; but u wanna do scan on below to not hard code it. someone can put any number to test out
        double miles = scan.nextDouble();
        double kilometers = miles * 1.689;
        System.out.println(miles +" in kilometers: " + kilometers);

    }
}
