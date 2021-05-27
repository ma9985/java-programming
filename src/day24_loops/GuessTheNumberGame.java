package day24_loops;
import java.util.*;
/*
secretNumber --> 0-100
guessingNumber = 0
DO
    "Guess the secret number"
    guessingNumber -> from nextInt

    if guessingNumber > secretNumber
        print "Wrong, your number is too large"
    if guessingNumber < secretNumber
        print "Wrong, your number is too small"

WHILE (secretNumber is not guessingNumber)

"Congratulations, you won! secret number: 44"
 */
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);
        //System.out.println(randomNumber.nextInt(101));
        int secretNumber = randomNumber.nextInt(10);
        int guessingNumber = 0;
         do {
             System.out.println("Guess the secret number");
             guessingNumber = scan.nextInt();
             if(guessingNumber > secretNumber) {
                 System.out.println("wrong, your number is too large");
             } else if (guessingNumber < secretNumber) {
                 System.out.println("wrong, your number is too small");
             }
         } while(secretNumber != guessingNumber);

        System.out.println("Congratulation, you won! secret number: " + secretNumber);

    }
}
