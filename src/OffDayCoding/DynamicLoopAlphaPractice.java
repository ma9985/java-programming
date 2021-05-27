package OffDayCoding;
/*
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z
• If it is lower: print the alphabet in all uppercase letter from a to z
 */
public class DynamicLoopAlphaPractice {
    public static void main(String[] args) {
        char letter = 'A';

        while (letter <= 'Z') {
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println();
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter+" ");
            letter--;
        }

    }
}
