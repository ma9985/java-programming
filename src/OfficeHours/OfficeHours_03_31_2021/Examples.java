package OfficeHours.OfficeHours_03_31_2021;

public class Examples {
    public static void main(String[] args) {
        String str = "Mohammad say's that he is 33 years old and was 32 last year";
        int count = 0;
        char letter = 's';

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(letter + " was found " + count + " times in " + str);
    }
}
