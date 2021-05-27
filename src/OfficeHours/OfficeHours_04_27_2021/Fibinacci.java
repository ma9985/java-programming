package OfficeHours.OfficeHours_04_27_2021;

import java.util.Arrays;

/*
Complete a method fib() that will compute Fibonacci numbers

In the Fibonacci series, the next number is the sum of previous two numbers.
For example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc...
The first two numbers of the Fibonacci series are 0 and 1.
 (Counting starts with an index 0, so the 0th number is 0, 1st number is 1, etc)

You are given a number num, print n-th Fibonacci Number.
 */
public class Fibinacci {
    public static void main(String[] args) {
        fib(8);
    }
    public static void fib (int num){
        int [] arr = new int [num+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
          arr[i] = arr[i-1] + arr[i-2];
            System.out.println(Arrays.toString(arr));
        }
    }
}
