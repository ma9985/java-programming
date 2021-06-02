package OfficeHours.OfficeHours_05_25_2021;

import java.util.Locale;
/*
    ~ A Pangram is a String that contains all of the letters in the alphabet ~
    Create a method that will accept a String and determine if the given String is a pangram.
     If it is a pangram return true, other wise return false. Example Pangrams: -A quick brown fox jumps over the lazy dog.
    -Back in June we delivered oxygen equipment of the same size.
 */
public class Pangram {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";

        System.out.println(isPangram(s));
    }

    public static boolean isPangram (String str ){
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i < str.length(); i++ ){

            if(Character.isLetter(str.charAt(i))){
                alp = alp.replace("" + str.charAt(i), "");
                //System.out.println(str.charAt(i) + " " + alp);
            }

            if(alp.isEmpty()){
                break;
            }

        }

        return alp.isEmpty();
    }

}
