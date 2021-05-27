package OfficeHours.OfficeHours_03_29_2021;
/*
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
Ex:
input: Java is a fun language
output: is a fun language Java
Hint: Use indexOf and substring
 */
public class MoveFirstWord {
    public static void main(String[] args) {
        String s1 = "wooden spoon";
        String s2 = " " + s1.substring(s1.indexOf("s"));
        System.out.println(s2);
    }
}
