package OfficeHours.OfficeHours_03_08_2021;
 import java.util.Scanner;

/*
            declare 2 variables : length and width
            -calculate the perimeter 2(l*w)
            -calculate the area 9(w*l)

            -print properties of the triangle
            -modify to accept Scanner inputs
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        // System.out.println("The length = " + length);
        // System.out.println(" the width = " + width);
        double perimeter = 2 * length * width;
        double area = width * length;
        System.out.println("The perimeter = " + perimeter);
        System.out.println("The area = " + area);


    }
}
