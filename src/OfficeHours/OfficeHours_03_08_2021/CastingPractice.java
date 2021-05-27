package OfficeHours.OfficeHours_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        // byte to short to int to long to float to double

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d =5.6;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println(i);  // 5
        System.out.println((double)i);

        float f = 3.54f;
        float f2 = (float)3.54; //float = (float)double

        float f3 = 5; //float = int -->
        float f4 = 5.5F; // float = double

        long l =22313; // long = int
        long l2 = 312132131322L;  // int wont work because its too big of number
        System.out.println((double)i);
        System.out.println((float)i2);
        System.out.println(i2);
        double million = 1_000_000;
        System.out.println(million);



    }
}

