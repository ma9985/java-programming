package day38_methods;

import java.util.Locale;

/*
  isNullOrEmpty
    Parameter: String str
    returns boolean
    true:
        str is null or empty ""
    otherwise false
 */
public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
        //System.out.println(word.isEmpty());

        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
//        if(str == null || str.isEmpty()) {
//            return true;
//        }
//        return false;
    }
/*
name: isPalidrome
params: String str
return: boolean
returns true if palindrome or false if not
 */
    public static  boolean isPalidrome(String str) {
    str = str.toLowerCase();
    for(int i = 0; i < str.length()/2;i++){
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            return false;
        }
    }
    return true;

    }


    /*
    StringUtils class:
    method: reverse
    param: String str
    return: String
StringUtilsTest:
main{
    StringUtils.reverse("java"); => "avaj"

     */
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
