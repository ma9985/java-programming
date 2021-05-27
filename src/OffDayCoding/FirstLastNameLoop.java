package OffDayCoding;
/*
Given two words. Print the first word without its first character then print the second word
without its last character.

Input:
apple
banana

Output:
pple
banan
 */
public class FirstLastNameLoop {
    public static void main(String[] args) {
        String wordOne = "apple";
        String wordTwo = "banana";
        System.out.println(wordOne.substring(1));
        System.out.println(wordTwo.substring(wordOne.length()-1));
    }
}
