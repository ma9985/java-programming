package OfficeHours.OfficeHours_04_06_2021;
/*
CHALLENGE – THIS WILL MAY BE DIFFICULT BUT TRY IT. DON’T SPEND TOO MUCH TIME
Generate a random number that is six digits long. Each digit in this number should be unique,
 meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random
 */
import java.util.Random;

public class RandomSixDigitNumber {
    public static void main(String[] args) {
    Random random = new Random();
        String randomNumber = "";

        while(randomNumber.length() != 6) {

            int eachRandom = random.nextInt(10); // check from 0-9 always

            if (!randomNumber.contains(""+eachRandom)){
                randomNumber += eachRandom;

            }
        }

        System.out.println("random number = " + randomNumber);
    }
}
