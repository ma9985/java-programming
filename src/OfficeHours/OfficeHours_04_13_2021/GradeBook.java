package OfficeHours.OfficeHours_04_13_2021;
/*
Declare three arrays:
1.String array which will hold names for the students (give values)
2.Int array which has the score of the student got in the quiz (give values)
3.Char array which will have some letter grade based on the score (empty)
4.Output the guidebook at the end with all the information
 */
public class GradeBook {
    public static void main(String[] args) {
        String[] names = {"Mohammad", "Jinan", "Idris"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < scores.length; i++) {
            int eachScore = scores[i]; //reads all the scores

            if (eachScore >= 85) {
                grades[i] = 'A';
            } else if (eachScore >= 75) {
                grades[i] = 'B';
            } else if (eachScore >= 65) {
                grades[i] = 'C';
            }
            grades[i] = 'D';
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);

        }

       // System.out.println("GradeBook");
       // for(int i=0; i < names.length; i++) {

    }

}
