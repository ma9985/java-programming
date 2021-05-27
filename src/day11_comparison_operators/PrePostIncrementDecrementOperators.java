package day11_comparison_operators;

import javax.swing.text.AsyncBoxView;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        // PRE - INCREMENT  ++ MEANS INCREASE BY 1
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 is = " + num1); // 11
        System.out.println("Num2 = " + num2); // 11

            // POST - INCREMENT
        int num3 = 8;  // 9
        int num4 = num3++;// 8
        System.out.println("num3 = " + num3);  // 9
        System.out.println("Num4 = " + num4);

        int apples = 5; //6
        int basket = ++apples; //6
        System.out.println("apples = " + apples);// 6
        System.out.println("basket = " + basket); //6

        int kiwi = 15;
        int kiwiBasket = kiwi++;

        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwi basket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars); //6

        int sedans = 19;   //no body does this but its just for understanding
        System.out.println(sedans++);
        System.out.println(sedans);

        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber); //45
        ++myNumber;
        System.out.println(myNumber); // now its 46 because it was 45 above and added another

       int hisNumber = 33;
        System.out.println(hisNumber++); //33
        System.out.println(hisNumber); //34

        int herNumber = 99;
        int yourNumber = herNumber++;
        System.out.println(herNumber); //100
        System.out.println(yourNumber++); //99

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);




    }
}
