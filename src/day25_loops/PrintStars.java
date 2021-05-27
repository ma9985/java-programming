package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 1; stars <= 15; stars++) {
            System.out.println("* ");
        }
        System.out.println();
        String myStars = "";
        for (int stars = 1; stars <= 5; stars++) {
            myStars += "* ";
            myStars += "* ";
            myStars += "* ";
            myStars += "* ";
            myStars += "* ";
            System.out.println("my stars = " + myStars);
        }


    }
}
