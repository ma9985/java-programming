package OfficeHours.OfficeHours_03_09_2021;
import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds;
        // how many seconds in a hour.
        // 60 sec = 1 min
        //60 min = 1 hour
        //60 *60 = 3600
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;
       // diff method can do , below easier~~  inputSeconds = inputSeconds % 3600;
        inputSeconds %= 3600;
        minutes = inputSeconds /60;
        inputSeconds %= 60;
        seconds = inputSeconds;
        System.out.println(hours + " hours, " + minutes + "minutes, " + seconds + " seconds");

    }

}
