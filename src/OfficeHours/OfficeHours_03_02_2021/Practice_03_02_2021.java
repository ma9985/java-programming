package OfficeHours.OfficeHours_03_02_2021;

public class Practice_03_02_2021 {
    public static void main(String[] args){
        String name = "Mohammad";
        byte age = 33;
        char gender = 'M';
        boolean student = true;
        short numberOfSiblings = 4;
        long favoriteNumber = 24;
        int numberOfSeasonsInYourArea = 4;
        double birthDate = 12.24;
        int year = 1987;
        String fullBirthDate = ("My birthday is on " ) + birthDate + '.' + year;
        String favoriteQuote = "Have a good mindset";

        System.out.println("Name: " + name);
        System.out.println("I am " + age + " old and " + "my gender is a " + gender);
        System.out.println(fullBirthDate);
        System.out.println("I have " + numberOfSiblings + " sibilings " + "and " + "i am a student which is " + student + '.');
        System.out.println("My favorite quote in java is " + favoriteQuote);

    }
}
