package day29_nestedloops_arrays;
/*
1) find duplicates and count
2) find unique characters(appearing only once)
3) print character and number of occurrences
 */
public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();

        }
        /*
         /**
         java
         ava
         va
         a
         OUTER : 0 - word.length()
            INNER : OUTER - word.length()
         */
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
