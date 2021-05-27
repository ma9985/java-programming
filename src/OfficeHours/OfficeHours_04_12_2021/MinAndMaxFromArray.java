package OfficeHours.OfficeHours_04_12_2021;
/*
•Write a program that can find the maximum number from any given int array

•Write a program that can find the minimum number from any given int array
 */
public class MinAndMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {3,1,5,3,10,4,3};
        int min = arr[0];
        int max = arr[0];

        for (int each : arr) {
            // each - > every element | for loop: arr[i]

            // or you can do for loop
           // for (int i = 0; i < arr.length; i++) {


            //is 1 less than 3
            if(each < min) {
                min = each;
            }
            if (each > max) {
                max = each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
