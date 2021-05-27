package OffDayCoding;
/*
Write a java program that can identify if a person is eligible to vote for the president. Age of voting: 18. Print "Eligible to vote" or "not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs
 */
public class AgeOfVoting {
    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.println("Eligible to vote");
            System.out.println("Is over the age of 18");
        } else {
            System.out.println("Is not eligible to vote");
            System.out.println("Under the age of 18");

        }
    }
}
