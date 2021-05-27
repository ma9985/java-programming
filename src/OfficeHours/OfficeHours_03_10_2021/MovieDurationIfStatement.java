package OfficeHours.OfficeHours_03_10_2021;

import java.util.Scanner;

public class MovieDurationIfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the movie");
        double movieLength = input.nextDouble();
        double price = 0;
        // = assignment
        // == compare
        if (movieLength == 1) {
            price = 8.99;
        }
        if (movieLength == 1.5) {
            price = 10.50;
        }
        if (movieLength == 2) {
            price = 12.99;
        }
        if (movieLength == 2.5) {
            price = 14.50;
        }
        if (movieLength >= 3.0) {
            price = 15.99;
        }

        System.out.println("Price: " + price);
    }
}


