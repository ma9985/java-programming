package OfficeHours.OfficeHours_03_02_2021;

public class Zoo {
    public static void main(String[] args) {
        String name = "Brookfield Zoo", foundedDate = "March 3, 2021",
                startTime = "7:00 AM", closingTime = "5:00 PM";
        boolean isOpenOnHolidays =  true, hasAquarium = true;
        int numberOfBigCats = 10 , numberOfHoofedAnimals = 15, numberOfReptiles = 20,
                numberOfBirds = 20, numberOfPrimates = 10, numberOfEmployees = 50;
        double ticketCostForAdults = 13.99, ticketCostUnder13 = 9.99;
        String parkingRules = "No eating or drinking outside of designated areas\n" + "No flash photography" +
                "\nNo Feeding the animals\nNo extensive perfumes";

        System.out.println("***********Welcome to Brookfield Zoo****************");
        System.out.println("Name: " + name);
        System.out.println("Founded: " + foundedDate);
        System.out.println("Open: " + startTime);
        System.out.println("Close: " + closingTime);
        System.out.println("Open on holiday's: " + isOpenOnHolidays);
        System.out.println("Has aquarium: " + hasAquarium);
        System.out.println( "Number of big cats: " + numberOfBigCats);
        System.out.println("Number of hoofed animals: " + numberOfHoofedAnimals);
        System.out.println("Number of reptiles: " + numberOfReptiles);
        System.out.println("Number of birds: " + numberOfBirds);
        System.out.println("Number of primates: " + numberOfPrimates);
        System.out.println("Number of employee's: " + numberOfEmployees);
        System.out.println("The cost for Adults: " + ticketCostForAdults);
        System.out.println("The cost for under 13: " + ticketCostUnder13);
        System.out.println("\n\tPark Rules:\n" + parkingRules);

    }
}
