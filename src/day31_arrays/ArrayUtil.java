package day31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33,};
        //print all nums in same lines
        System.out.println(Arrays.toString(nums));

        //sort all nums
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("min num = " + nums[0]);

        //arrays.sort(nums, collections.reverseOrder());

        String[] words = {"java", "c#", "c++", "Kotlin", "Python", "ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]"); //[java, c#, c++, Kotlin, Python, ruby, Assembly]

//sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));  //[Assembly, Kotlin, Python, c#, c++, java, ruby]

        //sort words reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));  //[ruby, java, c++, c#, Python, Kotlin, Assembly]4


    }
}
