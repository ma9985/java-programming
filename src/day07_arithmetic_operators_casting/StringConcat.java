package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("Java" + 5 + 3);  //Java53
        System.out.println("Java" + (5 + 3)); //Java8

        System.out.println(5 + 3 + ("java")); //8Java
        System.out.println(5 + (3 + "java")); //53java

        System.out.println("Hello" +1+2+3); //Hello123
        System.out.println(("Hello" +1+2+3)); //hello6

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + str2); //hello friends
        System.out.println(str1 +" "+str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2); //15
        System.out.println(num1+ " "+num2); //7 8
        System.out.println(num1+""+num2); //78
        //
        System.out.println(5 + " " + 5); //--> 5 5
       System.out.println(5 + "" + 5); //--> 55
        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2); //195
        System.out.println(char1 + "" + char2); // ab
        System.out.println(char1 + " " + char2); //a b

        //Operator precedence
        System.out.println(5 + 5 * 3); // --> 20
    }
}
