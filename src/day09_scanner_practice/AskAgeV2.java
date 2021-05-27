package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you");
        int age = scan.nextInt(); //instead of me putting int age = 33 to say that's my personal age.
        // we put the scan.nextInt() to show anyone's age
        System.out.println(age + " -that's great age!");

    }
}
