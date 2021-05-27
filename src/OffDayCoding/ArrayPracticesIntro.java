package OffDayCoding;
import java.util.*;
import java.util.Arrays;

public class ArrayPracticesIntro {
    public static void main(String[] args) {
        // Print Array:

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        // First way - using loop:
        for (char each : letters) {
            System.out.print(each + ", ");
        }
        // Second way - Cast it To Stirng then print as a String
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        //-------------------------------------------//
        // length of Stirng Vs Length of Array:

        System.out.println();
        String item = "wooden spoon";
        System.out.println("length Of Characters = " + item.length());
        System.out.println(item);
        char[] itemArray = item.toCharArray();
        System.out.println("length Of Index = " + itemArray.length);

        //--------------------------------------------//
        // Print Array :

        System.out.println();
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitsStr = "";

        for (String each : fruits) {
            System.out.print(each + ", ");
            fruitsStr += each + ", ";
        }
        System.out.println("fruitsStr = " + fruitsStr);
        System.out.println();

        //with Array:
        System.out.println(Arrays.toString(fruits));
        System.out.println();

        //--------------------------------------------//
        // Join Arrays:

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join(" ", languages));
        String joinedLanguages = String.join(" <> ", languages);
        System.out.println();
        System.out.println(joinedLanguages);
        // System.out.println(Arrays.toString(joinedLanguages));
        System.out.println(Arrays.toString(languages));

        //---------------------------------------------//
        // import java.util.Arrays;

        System.out.println();
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(nums); //  ==> [I@5cad8086
        // print all nums
        // fist way - for loop:
        for (int each : nums) {
            System.out.print(each + ", ");
        }
        // second way - Print as a Array - Use Array Class
        System.out.println();
        System.out.println(Arrays.toString(nums));

        //----------------------------------------------//
        // Max and Min Value:
        // first way - Using for loop

        System.out.println();
        int[] nums2 = {100, 5, 5, 0, 50, 1000, 44, 33};

        int maxValue = 0;
        int minValue = 0;
        for (int each : nums2) {
            System.out.print(nums2);
            if (each > maxValue) {
                maxValue = each;
            }
            if (each < minValue) {
                minValue = each;
            }
        }
        System.out.println("Xax Value = " + maxValue);
        System.out.println("Min Value = " + minValue); // because the condition always false and min = 0

        // HOW TO EXECUTE THE MINIMUM VALUE WITH LOOP :

        for (int i = 0; i < nums2.length; i++) {

            if (i == 0) { // It means when we are in the first round of the loop ==> i is 0 , index[0]
                minValue = nums2[i];
            }

            if (nums2[i] < minValue) {
                minValue = nums2[i];
            }
        }
        System.out.println();
        System.out.println("minimum value = " + minValue);

        //  Second way - Using Array

        System.out.println();
        int[] nums3 = {100, 5, 5, 0, -50, 1000, 44, 33};

        Arrays.sort(nums3);
        // System.out.println(nums3);  ==> [I@6e0be858
        System.out.println();
        System.out.println(Arrays.toString(nums3));
        System.out.println("Min Value = " + nums3[0]); // first index
        // System.out.println("Max Value = "+nums3[nums3.length]);  ==> Out of Bond
        System.out.println("Max Value = " + nums3[nums3.length - 1]);

        //-----------------------------------------------------//
        // Max And Min in String Arrays


        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        // how to print i one line as String:
        System.out.println(Arrays.toString(words));
        // how to add print as same as array with using join :
        System.out.println("[" + String.join(", ", words) + "]");
        // how to sort it:
        Arrays.sort(words);
        // System.out.println(words); // ==> @6e0be858
        System.out.println();
        System.out.println(Arrays.toString(words));
        // how to UpperCase:
        System.out.println(Arrays.toString(words).toUpperCase());
        // how to lowerCase:
        System.out.println(Arrays.toString(words).toLowerCase());

        //----------------------------------------------------------//
        //sort words in reverse order

        System.out.println();
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

        //-------------------------------------------------------------//
        // BinarySearch
        // Find number of index in Array Or check availability in arrays

        int[] numbers = {-5, 23, 123, 654, 2344, 12345, 14421};

        System.out.println();
        System.out.println(Arrays.binarySearch(numbers, 23)); //1
        System.out.println(Arrays.binarySearch(numbers, 2344));//4
        System.out.println(Arrays.binarySearch(numbers, 25)); //-3
        System.out.println(Arrays.binarySearch(numbers, 700)); //-5
        System.out.println(Arrays.binarySearch(numbers, -5)); //0

        // //check if number 12345 is among numbers in array

        if (Arrays.binarySearch(numbers, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present");
        }

        //---------------------------------------------------------------//
        // ArrayEquals:

        System.out.println();
        int[] numbers2 = {4, 5, 2, 10};
        int[] numbers3 = {10, 4, 5, 2};

        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};

        System.out.println();

        System.out.println("numbers2 == numbers3 ==> " + Arrays.equals(numbers2, numbers3));
        System.out.println(numbers2 == numbers3); //check if point to same object in memory

        System.out.println();

        System.out.println("cars1 == cars2 ==> " + Arrays.equals(cars1, cars2));
        System.out.println("cars2 == cars3 ==> " + Arrays.equals(cars2, cars3));

        // ignore Case:
        if (Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))) {
            System.out.println("cars2 == cars3 match - ignorecase");
        }
    }
}