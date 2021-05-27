package OffDayCoding;

public class TheHomeVibes {
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


        System.out.println("");

    }



}
