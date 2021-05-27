package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
/*
FizzBuzz
=====================================

When a number is divisable by 2 then it is an EVEN number.
EVEN -> divisable by 2 (no remainder - 0)
ODD  -> NOT divisable by 2 (remainder is 1)

add new class EvenOrOdd
main method

num = 4;

when num is divisable by 2
    print num is even
otherwise
    print num is odd
==================================

multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */

        int num = 5;
        System.out.println(num % 2);
        System.out.println( num % 2 == 0);

        if (num % 2 ==0 ) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is off");
        }

        }

    }
