package day32_arrays_split;
import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
                //       0     1      2       3
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = "+wordsArray.length);

        for (String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "Today i am coding java arrays";
        String[] wordsIntSentence = sentence.split(" ");
        System.out.println("first word = " + wordsIntSentence[0]); //first word = Today
        System.out.println("first word = " + sentence.split(" ")[0]); //  word = Today
        System.out.println("number of words in sentence = " + wordsIntSentence.length); //number of words in sentence = 6

        for (String each : wordsIntSentence) {
            System.out.println(each);
        }
    }
}
