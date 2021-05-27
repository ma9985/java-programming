package OfficeHours.OfficeHours_03_23_2021;

import java.util.Scanner;


public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        if(num >0) {
            // pos
            System.out.println("Enter a single word");
            String word = input.next();

            if(word.length() %2 ==0 ){
                System.out.println(word + " is even length");
            } else {
                System.out.println(word + " is odd length");
            }


        } else {
            //neg
            System.out.println("Enter a character");
            char letter = input.next().charAt(0);
/*
[Character Checker]
Given a letter (char) determine if the character is an uppercase letter or lowercase letter
 Ex: 'b' --> lowercase
 'G' --> uppercase
 'O' --> uppercase
Hint: Use the ASCII table
 */

            if (letter >'A' && letter <= 'Z') {
                System.out.println(letter + " is an uppercase letter");
            } else {
                if (letter >= 'a' && letter <= 'z') {
                    System.out.println(letter + " is a lowercase letter");
                } else {
                    System.out.println("Not a valid letter");


                }
            }
        }
    }
}
