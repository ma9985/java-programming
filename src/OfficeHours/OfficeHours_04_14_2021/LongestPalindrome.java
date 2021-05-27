package OfficeHours.OfficeHours_04_14_2021;
/*
Given a String array. Find the longest Palindrome String in your array.

Ex: Input: [“java”, “longer word”, “civic” “apple”,  “race car”, “mom”, “anna”]Output: race car

Ex:Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]Output: No palindrome



 */
public class LongestPalindrome {
    public static void main(String[] args) {

        String[] words = {"java", "Longer word", "civic", "apple", "race car", "mom", "anna"};
        String LongestPalindrome = "";

        for(String word : words) {
            boolean isPalindrome = true;

            for (int i =0; i < word.length()/2; i++) {
                if (word.charAt(i) != word.charAt(word.length()-1-i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && word.length() > LongestPalindrome.length()) {
                LongestPalindrome = word;
            }
        }
        System.out.println((LongestPalindrome.isEmpty() ? "no palindrom" : LongestPalindrome));
    }
}
