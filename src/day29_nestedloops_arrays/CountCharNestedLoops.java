package day29_nestedloops_arrays;
/*
String word = "java";

OUTER 0 - LENGTH {
    //char outerChar = word.charAt(OUTER);
    int count = 0;
    INNER 0 TO LENGTH {
        //char innerChar = word.charAt(INNER);

        IF outerChar == innerChar
            count++;
     }
     PRINT outerChar + "=" + count
}
 */
public class CountCharNestedLoops {
    public static void main(String[] args) {
        String word = "java";
        for(int outer =0; outer < word.length(); outer++){
            System.out.print("outer: " + word.charAt(outer));
            int count = 0;

            for(int inner = 0; inner < word.length(); inner++) {
                //System.out.print("inner: " + word.charAt(inner));
                if(word.charAt(outer) == word.charAt(inner)) {
                    count++;
                }
        }
            System.out.println(word.charAt(outer) +"="+count);
        }
    }
}
