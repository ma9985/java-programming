package OfficeHours.OfficeHours_06_14_2021;
/*
    This class is to create objects of Candy, Take5, Twix and see how they are working
 */
public class CandyFactory {
    public static void main(String[] args) {

        Candy candy = new Candy("generic", 10, true);
        System.out.println(candy);

        Take5 barOne = new Take5(4, true);
        System.out.println(barOne);

        Twix barTwo = new Twix("peanut butter", 4 , false);
        System.out.println(barTwo);


        System.out.println(Candy.getTotalNumberOfCandy());

        }

}
