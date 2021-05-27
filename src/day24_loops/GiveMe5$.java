package day24_loops;
import java.util.*;
/*
Print "Give me 5 dollars"

int dollar = scanner input

while dollar is not 5
    KEEP asking
    "Give me 5 dollars"
    and input dollar from scanner
-------
Thank you for 5 dollars
-----------------------
 */
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me 5 dollars");
        int dollars = scan.nextInt();

        while(dollars != 5) {
            System.out.println("give me 5 dollars");
            dollars = scan.nextInt();

        }
        System.out.println("thank you for 5 dollars");


    }
}
