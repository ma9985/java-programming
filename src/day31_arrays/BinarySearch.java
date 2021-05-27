package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //            0    1    2    3      4      5
        int[] nums = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 123)); // 0
        System.out.println(Arrays.binarySearch(nums, 2344)); // 3

        //check if the number 12345 is among numbers in array
        if (Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present in array");
        }
    }
}
