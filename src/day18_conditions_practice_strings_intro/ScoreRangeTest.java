package day18_conditions_practice_strings_intro;
/*
RangeChecks with numbers/chars

age:
    1 - 3 -> baby
    3 - 7 -> toddler
    7 - ........

score:     // this one first for practice
    1-40 -> D
    41-60-> C
    61-90 ->B
    91-100 ->A...
 */
public class ScoreRangeTest {
    public static void main(String[] args) {
        int score =101;
        if (score >= 1 && score <= 40) {
            System.out.println("score is D");
        } else if (score >= 41 && score <= 60) {
            System.out.println("score is C");
        } else if (score >= 61 && score <= 90) {
            System.out.println("score is B");
        } else if (score >= 91 && score <= 100) {
        } else if (score <= 0 || score > 100){
            System.out.println("Invalid score = " + score);
        }

    }
}
