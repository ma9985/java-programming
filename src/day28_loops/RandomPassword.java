package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuv0123456789_!@#$%^?";
        Random random = new Random();  // generating random number
        String password = "";

        for (int i = 1; i < 8; i++) {
            int index = random.nextInt(71);  //random number 0 - 70
            System.out.print(source.charAt(index));
            password += source.charAt(index);
        }
        System.out.println("\nYour password is " + password);
    }
}
