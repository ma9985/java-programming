package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Values:");
        double rent = scan.nextDouble();
        String month = scan.nextLine();
//means bug above when the nextline is after nextdouble nextInt ..exct....
        System.out.println(rent);
        System.out.println(month);




    }
}
