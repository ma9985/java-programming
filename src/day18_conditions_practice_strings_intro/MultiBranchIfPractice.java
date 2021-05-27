package day18_conditions_practice_strings_intro;
/*
number => 5

number is more than 0
    print 5 is positive
number is less than 0
    print number is negative
number equal 0:
    print number is zero
 */
public class MultiBranchIfPractice {
    public static void main(String[] args) {
        int number = -1;

        if (number > 0){
            System.out.println(number +" is positive");
        } else if (number < 0) {
            System.out.println(number +" is negative");
        } else {   // or use this ---->   if (number == 0)
            System.out.println(number +" is equal to zero");
        }
    }
}
