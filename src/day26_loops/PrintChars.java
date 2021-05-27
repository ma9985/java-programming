package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "python";  // we gonna loop from beginning of string to end
        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + "-" + word.charAt(i));
        }

        /**
         * print letters back words
         */

        word = "Mohammad";
        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
