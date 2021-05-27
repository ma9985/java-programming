package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

 */
public class MethodsWithList {
    public static void main(String[] args) {
        //declare String arraylist and add values
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("a");
        words.add("input");
        words.add("title");
        // pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23,54554,234,11,5,2);
       int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum); //sum = 54906

    }

    public static void printStrList(List<String> str) {
        for (String each : str) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    /**
     * method: sumIntegerList
     * param : List of Integers
     * return int
     * calculates sum of integers in the list than returns
     */
    public static int sumIntegerList(List<Integer> list) {
            int sum = 0;
            for(int i : list) {
                sum += i;
            }
        return sum;

    }

}
