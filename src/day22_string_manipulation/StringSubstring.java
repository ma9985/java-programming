package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         *  word.substring(startIndex, endIndex)
         */
        System.out.println(word.substring(0 , 4));  //java
        System.out.println(word.substring(5, 7));   // prints is
        System.out.println(word.substring(8,  11)); // fun

        System.out.println(word.substring(1)); //ava is fun

    }
}
