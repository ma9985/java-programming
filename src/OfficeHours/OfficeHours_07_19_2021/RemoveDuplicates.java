package OfficeHours.OfficeHours_07_19_2021;
 /*
 Create a method that will accept a String and returns a String with the duplicate instances of characters removed

Ex:
    Input: "AAABBBCCCD"
    Output: ABCD
   * loop through each char I will compare with each other char in the String
         */

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicateChars (String str) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
       // return set.toString(); // A,B,C,D

        return String.join("",set);  //ABCD
    }


    public static void main(String[] args) {


        System.out.println(removeDuplicateChars("AAABBBCCCD"));
    }
    }

