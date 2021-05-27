package OfficeHours.OfficeHours_03_17_2021;
/*
    [Baking contest]
You are in a baking contest. Your cookies will be rated by 3 judges.
The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
     */
import java.util.Scanner;

public class BakingContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge" + judge++ + " score ");
        int score1 = input.nextInt();
        System.out.println("Enter judge" + judge++ + " score ");
        int score2 = input.nextInt();
        System.out.println("Enter judge" + judge++ + " score ");
        int score3 = input.nextInt();
        System.out.println("Other person 1's score");
        int otherPerson1 = input.nextInt();
        System.out.println("Other person 2's score");
        int otherPerson2 = input.nextInt();

        int averageScores = (score1 + score2 + score3) / 3;
        if (averageScores < otherPerson1 && averageScores > otherPerson2) {
            System.out.println("First place");
        } else if (averageScores > otherPerson1 && averageScores > otherPerson2 || averageScores < otherPerson1
                && averageScores > otherPerson2) {
            System.out.println("Second place");
        } else {
            System.out.println("Third place");
        }



    }
}
