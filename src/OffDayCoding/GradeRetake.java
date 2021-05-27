package OffDayCoding;
/*
Write a program that will give the grade after the retake.
 The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
 */
public class GradeRetake {
    public static void main(String[] args) {
        int grade = 90;
        int numberOfAttempts = 3;
        int afterRetakeGrade = 0;

        if (numberOfAttempts == 1) {
            afterRetakeGrade = (int)(grade * .10);
        } else if(numberOfAttempts == 2) {
            afterRetakeGrade = (int)(grade * .20);
        } else if(numberOfAttempts == 3) {
            afterRetakeGrade = (int)(grade * .35);
        } else {
            System.out.println("invalid attempts");
        }
        System.out.println("The grade after the retake attempts " + numberOfAttempts + " and " + (grade - afterRetakeGrade));

    }

}
