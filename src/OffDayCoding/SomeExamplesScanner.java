package OffDayCoding;
import java.util.Scanner;
/*
Given a String variable word assume the variable has a value and use it to display the word of the day.

Ex:
Input:
Java

Output:
Today's word of the day is: Java

Ex:
Input:
Apple

Output:
Today's word of the day is: Apple
 */
public class SomeExamplesScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String wordOfTheDay = input.next();
        System.out.println("Todays word of the day is: " + wordOfTheDay);




    }


}
