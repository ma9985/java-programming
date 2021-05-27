package OfficeHours.OfficeHours_04_13_2021;
/*
Given a String of words that are separate by commas. Find and print any words that have more than one word.
ExampleInput: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer”
Output:
wooden spoons
trash can
dish washer
 */

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String words= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] arrWords= words.split(", ");


        for(String eachWord : arrWords){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }

        }



}
