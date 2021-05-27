package OffDayCoding;
/*
Write a program that will accept a boolean value. Print out the opposite of the given boolean

Ex: true -> false
    false -> true
    boolean isTrue = true;
        if(isTrue = false){
            System.out.println("Yes it is true boolean = " + isTrue);
        } else {
            System.out.println("No it is not true boolean = " + isTrue);
            isTrue = false;
        }
        System.out.println("This stuff makes no sense in java");
 */
public class TrueFalseBoolean {
    public static void main(String[] args) {
        boolean isTrue = true;
        if (isTrue == true){
            System.out.println("Is true to boolean = " + isTrue);
        } else {
            System.out.println("is not true to boolean = " + isTrue);
            isTrue = false;
        }
        System.out.println("this stuff sucks ass");
    }
}
