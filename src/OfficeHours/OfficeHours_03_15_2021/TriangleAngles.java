package OfficeHours.OfficeHours_03_15_2021;
/*
A triangle is valid if the sum of all the three angles is equal to 180 degrees.

Write a program that declares three integers as angles and check whether the
triangle is valid or not.
 Print "Valid triangle" or "Not a valid triangle".

 */
public class TriangleAngles {
    public static void main(String[] args) {
        int anglesOne = 50;
        int anglesTwo = 30;
        int anglesThree = 100;
        int sum = anglesOne + anglesTwo + anglesThree;

       // or do this    boolean check = ( anglesOne + anglesTwo + anglesThree) == 180
        if (sum == 180) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("invalid triangle");
        }


    }
}
