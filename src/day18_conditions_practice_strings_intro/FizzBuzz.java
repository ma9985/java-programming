package day18_conditions_practice_strings_intro;
/*

**********When a number is divisable by 2 then it is an EVEN number.
EVEN -> divisable by 2 (no remainder - 0)
ODD  -> NOT divisable by 2 (remainder is 1)**********

number = 5
"FizzBuzz" -> when number is divisible by 3 and(&&) 5
"Fizz" -> when number is divisible by 3
"Buzz" -> when number is divisible by 5
 */
public class FizzBuzz {
    public static void main(String[] args) {
       int number = 11;

       if (number % 3 ==0 && number % 5 ==0) {
           System.out.println("FizzBuzz");
       } else if (number % 3 ==0) {
           System.out.println("Fizz");
       } else if (number % 5 ==0) {
           System.out.println("Buzz");
       } else {
           System.out.println(number);
       }
    }

}
