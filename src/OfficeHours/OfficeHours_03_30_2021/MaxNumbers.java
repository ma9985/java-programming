package OfficeHours.OfficeHours_03_30_2021;
import java.util.Scanner;
/*
   [Max and Min from 5 numbers]
   • Write a program that can ask the user "enter a number" five times and return the maximum number
   • Write a program that can ask the user "enter a number" five times and return the minimum number
    */
public class MaxNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int max = 100;

        for(int i = 0; i < 5; i++){  // this way is quicker searching each 5 times
            System.out.println("enter a number");
            int number = input.nextInt();

            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);

    }
}
