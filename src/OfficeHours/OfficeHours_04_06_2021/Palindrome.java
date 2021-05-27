package OfficeHours.OfficeHours_04_06_2021;

public class Palindrome {
    public static void main(String[] args) {

        String word = "anna";  // we did to check if first and last letter match. this called palindrome
        boolean isPalindrome = true;
        // Q: what if your String has million characters

        for (int i =0; i < word.length()/2; i++) {

            if (word.charAt(i) != word.charAt(word.length()-1-i)){
            isPalindrome = false;
            break;
            }
        }
        System.out.println(isPalindrome);

    }
}
