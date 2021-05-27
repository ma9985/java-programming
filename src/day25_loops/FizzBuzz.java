package day25_loops;
/*
loop from 1 to 100
    when num divisible by 3 and 5
        -> "FizzBuzz"
    when num divisible by 3
        -> "Fizz"
    when num divisible by 5
        -> "Buzz"
    else
        -> print num
------------------------------------
 */
public class FizzBuzz {
    public static void main(String[] args) {
            for(int i = 1; i <= 100; i++) {
                if(i % 3 == 0 && i % 5 ==0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0 ){
                    System.out.println("Fizz");
                    } else if(i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
            //     for(int i = 1; i <= 100; i++) {
        //            if(i % 3 == 0 && i % 5 == 0) {
        //                System.out.println("FizzBuzz");
        //            }else if(i % 3 == 0) {
        //                System.out.println("Fizz");
        //            }else if (i % 5 == 0) {
        //                System.out.println("Buzz");
        //            }else{
        //                System.out.println(i);
    }
}
