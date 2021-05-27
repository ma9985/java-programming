package OfficeHours.OfficeHours_04_20_2021;
import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();

        for(int i = 0; i <= word.length(); i++ ){
            System.out.println(word.charAt(i));
        }

    }
}
