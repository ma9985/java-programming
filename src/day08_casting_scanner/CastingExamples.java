package day08_casting_scanner;

import java.sql.SQLOutput;

public class CastingExamples {
    public static void main(String[] args) {
        //byte - short - int - long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;;
        int num4 = num3;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;

        System.out.println(num8);
        System.out.println("num9 = " + num9);

       // int num1 = 55;
       // byte num2 = num1; --> this line is error, int is larger than byte

        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10; // cast/convert tp smaller short
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num14 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num15 = " +num15); //1234.5
        System.out.println("num16 = " + num16);//1234

        int num17 =300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " +num17);//200
        System.out.println("num18 = " +num18);//-56

        char letter = 'M';
        int numLetter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numLetter = " +letter);
        //if you remember every char also has number associated to it.'a'-->97
        //so if u assign char variable into in that the number will be assigned.

        char ch = 'J';
        int chNum = ch; //74
        System.out.println(chNum);

        double d = 10.5;
        short sh = (short)d;
        System.out.printf("sh");

        int num =(int)123.4;
        System.out.println(num);//123

        double d1 =123;
        System.out.println(d1);






    }
}
