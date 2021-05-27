package day42_arraylist;
import java.util.*;

public class CollectionsUtil_101 {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's','f','u', 'n'));
        System.out.println("size = " + letters.size());  //size = 9
        System.out.println(letters); // [j, a, v, a, i, s, f, u, n]

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);   //reversed = [n, u, f, s, i, a, v, a, j]

        //find count of "a" in letters
        System.out.println(Collections.frequency(letters, 'a'));  //2

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);   //vCount = 1

        // this supposed to give u highest value according to ASCI value
        System.out.println("Max char = " + Collections.max(letters));  //Max char = v
        System.out.println("Min char = " + Collections.min(letters));  //Min char = a

        Collections.reverse(letters);
        System.out.println(Collections.replaceAll(letters, 'a', 'u'));
        Collections.replaceAll(letters, 'i', 'j');//this is before we replace ('j', 'a', 'v', 'a', 'i', 's','f','u', 'n')
        System.out.println("after replaceAll = " + letters);  //after replaceAll = [j, u, v, u, j, s, f, u, n]

        Collections.sort(letters);
        System.out.println("After sort = " + letters);  //After sort = [f, j, j, n, s, u, u, u, v]

        //       ``````````````````````````````````````````````````
        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0, 1, 5, 5 ,5 ,5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);//nums after reverse = [5, 5, 5, 5, 1, 0, -9, 7, 234, 5, 43, 1, 23]

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max); //max = 234
        System.out.println("min = " + min);// min = -9

       // we created a variable first. in this 'nums' need to find how many times is '5'.
        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);  //countOfFives = 5

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s); //countOf1s = 2

        Collections.replaceAll(nums, 5, 50); //after replaceAll = [50, 50, 50, 50, 1, 0, -9, 7, 234, 50, 43, 1, 23]
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("after shuffle" + nums);
    }

}
