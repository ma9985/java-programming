package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly Rate:");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly Pay: " + weeklyPay);
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Annual Pay: " + annualPay);


    }
}
