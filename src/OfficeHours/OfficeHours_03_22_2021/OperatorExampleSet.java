package OfficeHours.OfficeHours_03_22_2021;

public class OperatorExampleSet {
    public static void main(String[] args) {
        int a=3, b=2; // a = 2 b = 2
        long c = (a-- + b) * 2 / 3 % 2;

        short c2 = (short) ((a-- + b) * 2 / 3 % 2);
    }
}
