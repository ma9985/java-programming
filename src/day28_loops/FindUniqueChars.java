package day28_loops;

/**
 * given a string retrieve
 */
public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "AAABBBCCCDEF";
        String unique = "";

        for(int i = 0; i < word.length(); i++) {
            //if word.charAt(i) is not contains in unique
            //add to unique
            if(!unique.contains(word.charAt(i)+"")) {
                unique += word.charAt(i);
            }
        }

        System.out.println(unique);
        }

}
