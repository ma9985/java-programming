package OfficeHours.OfficeHours_03_16_2021;
/*
[Oxygen level - If statements, operators]

You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
x
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%
 */
import java.util.Scanner;

public class OxygenLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the level number");
        int oxygenLevel = input.nextInt();

        if (oxygenLevel > 90) {
            System.out.println("Yes it is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't get too far");
        } else if (oxygenLevel >60) {
            System.out.println("Get back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be care full almost at 50%");
        }
        System.out.println("below 50%, at: " + oxygenLevel);
    }
}
