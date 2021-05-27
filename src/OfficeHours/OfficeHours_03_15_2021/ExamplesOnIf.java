package OfficeHours.OfficeHours_03_15_2021;

public class ExamplesOnIf {
    public static void main(String[] args) {

        int a =10; // a = 9 beomces 8
        int b = a-- * 2 - --a % 2 + a;
         //     10 * 2 - 8 % 2 + 8
        //      20 - 8 % 2 + 8
        //       20 - 0 + 8
        //          20 + 8
        //            28
        System.out.println(b);

    }
}
