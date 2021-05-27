package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("!!!!!!!!!! F TO C CONVERTER PROGRAM!!!!!!!!!!");
        System.out.println("Enter Your Current Temp to convert: ");
        System.out.println("Enter Fahrenheit value: ");
        double fahrenheitValue = input.nextDouble();
        //double fahrenheitValue = 55.0;
        double celsiusValue = (fahrenheitValue - 32) * 5 / 9;
        System.out.println(celsiusValue+"F is in C:" +celsiusValue);
    }
}
