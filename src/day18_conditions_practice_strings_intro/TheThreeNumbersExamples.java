package day18_conditions_practice_strings_intro;
/* this is comparison type
3 numbers , find the largest value.
if all are equal, print any of them.
if 2 are largest and equal, print either one
just print largest one.

num1,num2,num3

print "Largest value: 44"

num1 = 100;
num2 = 44;
num3 = 11;
 */
public class TheThreeNumbersExamples {
    public static void main(String[] args) {
        int num1 = 305;
        int num2 = 220;
        int num3 = 100;
        int largestValue = 44;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is largest value");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println(num3 + " is the largest");

        }

    }
}
