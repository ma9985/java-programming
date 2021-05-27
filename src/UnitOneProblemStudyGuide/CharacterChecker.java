package UnitOneProblemStudyGuide;
import java.util.Scanner;
/*
[Character Checker]
Given a letter (char) determine if the character is an uppercase letter or lowercase letter
 Ex: 'b' --> lowercase
 'G' --> uppercase
 'O' --> uppercase
Hint: Use the ASCII table
 */
public class CharacterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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

        if (letter > 'A' && letter <= 'Z') {
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