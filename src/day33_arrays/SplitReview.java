package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);   // 2
        int countOfA = array.length;
        System.out.println("countOfA = " + countOfA);
        if (word.endsWith("a")) {  // if ends with a, add one more
            countOfA++;

        }
        System.out.println("yes conts of a = " + countOfA);

        System.out.println("------Split with empty strings------");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String word2 = "java1sql2ht4ml";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("invalid password");

    }
}

}
