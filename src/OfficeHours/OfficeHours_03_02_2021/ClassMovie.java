package OfficeHours.OfficeHours_03_02_2021;


public class ClassMovie {
    public static void main(String[] args){
        String name = "Java Drama";
        String genre = "Dramatic";
        String duration = "2 hours";
        String releaseDate = "June 10, 2021";
        char rating = 'R';
        boolean isASequelOrNot = true;
        byte rottenTomatoesRatings = 95;
        boolean isOnDvd = true;

        System.out.println("************Welcome to the Cinema*****************");
        System.out.println("Tonight we are streaming " + name + " which was released on " + releaseDate + '.');
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRatings + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating + "and it runs for the " + duration + '.');
        System.out.println("This is a sequel " + isASequelOrNot + " and is on dvd player");

    }

}
