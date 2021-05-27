package day09_scanner_practice;
/*
assume 40 hours of work in a week
Enter hourly rate
50
we need calculate: weeklyPay, monthlyPay, annualPay

print all three in 3 lines
 */
import java.util.Scanner;
public class SalaryCalc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Paycheck!");
        double hourlyRate = input.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 4;
        double annuallyPay = monthlyPay * 12;

        System.out.println("Your weekly pay is $" + weeklyPay);
        System.out.println("you monthly pay is $" + monthlyPay);
        System.out.println("your annually pay is $" + annuallyPay);
    }
}
