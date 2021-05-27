package day38_methods;
/**
 * import all static methods. so that you can just call by method name, with out classname
 */

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName ="";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: userName cannot be null or empty");
        }
        System.out.println("isPalidrome(civic) = " + StringUtils.isPalidrome("civic"));
        System.out.println("isPalidrome(kayak) = " + StringUtils.isPalidrome("kayak"));
        System.out.println("isPalidrome(Cybertek) = " + StringUtils.isPalidrome("Cybertek"));

        String word = "Mohammad";
        String revWord = StringUtils.reverse(word);
        System.out.println("revWord = " + revWord);
        System.out.println("word = " + word);
        System.out.println(StringUtils.reverse(word));
    }
}
