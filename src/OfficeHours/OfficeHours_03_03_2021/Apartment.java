package OfficeHours.OfficeHours_03_03_2021;

public class Apartment {
    public static void main(String[] args) {
        String corporation = "*******WELCOME TO FIGM ESTATES********";
        String address = "7311 Sandalwood drive", nameOfOwner = "Mohammad Abdelqader";
        int numberOfUnits = 12;
        String averageSizeOfEachUnit = "800sqft";
        double monthlyRentAmount = 1200;
        int numberOfWasherAndDriers = 4;
        boolean allowsPetsOrNot = false;
        boolean hasPool = true;
        int lengthOfLease = 1;
        int totalNumberOfResidentsInBuilding = 12;
        String phoneNumberOfOwner = "7086686886";
        boolean isNearAGasStation = true;
        int numberOfFloors = 3;
        boolean hasABasement = true;
        char hasAvailableUnitsForRent = 'Y';
        char hasAirConditioning = 'Y';
        int numberOfParkingSpaces = 24;
        char hasWheelChairAccess = 'Y';
        int numberOfReviewStars = 5;
        double monthlyRentAfter3Years = monthlyRentAmount % 10;
        double averageNumberOfPerUnit = (totalNumberOfResidentsInBuilding / numberOfUnits);
        double averageNumberOfParkingSpotsPerUnit = (numberOfParkingSpaces / averageNumberOfPerUnit);
        double averageNumberOfUnitsPerFloor = (averageNumberOfPerUnit / numberOfFloors);

        System.out.println(corporation);
        System.out.println("Address: " + address);
        System.out.println("Owner name: " + nameOfOwner);
        System.out.println("Owners phone number: " + phoneNumberOfOwner);
        System.out.println("The number units in building: " + numberOfUnits + " units and the average size of each unit is " + averageSizeOfEachUnit + '.');
        System.out.println("The monthly rent amount is " + monthlyRentAmount);
        System.out.println("The total amount of residents in building: " + totalNumberOfResidentsInBuilding);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Lease terms: " + lengthOfLease + " year. ");
        System.out.println("Pets allowed:  " + allowsPetsOrNot);
        System.out.println("Basement: " + hasABasement);
        System.out.println("It is near gas station:  " + isNearAGasStation);
        System.out.println("Available units for rent: " + hasAvailableUnitsForRent);
        System.out.println("Air conditioning available: " + hasAirConditioning);
        System.out.println("Number of parking Spaces: " + numberOfParkingSpaces);
        System.out.println("Wheelchair accessible " + hasWheelChairAccess);
        System.out.println("Review stars: " + numberOfReviewStars);
        System.out.println("*************************************************************");

        System.out.println("The building has an average number of parking spots of:  " + averageNumberOfParkingSpotsPerUnit);
        System.out.println("The budiling has an average units each floor of ");








    }
}
