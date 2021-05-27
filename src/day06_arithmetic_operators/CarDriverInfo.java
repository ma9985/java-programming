package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Toyota";
        String driverName = "Mohammad";
        String licenseNumber = "FIGM";
        byte speed = 80;
        boolean isAutomatic = true;
        char licenseClass = 'A';
        String str = "My name is "; //examples
        String firstName = "Mohammad"; // examples

        System.out.println("Car Model: " + carModel);
        System.out.println(carModel + " is the car model");
        System.out.println("Name of Driver: " + driverName);
        System.out.println("The license number: " +licenseNumber);
        System.out.println("The speed: " + speed + "mph");
        System.out.println("Is Automatic: " + true);
        System.out.println("licenseClass: " + licenseClass);
        System.out.println(10 + 5); // this works to add a math
        System.out.println("b1"+"b2"); // you can do this if you adding boolean for example
        System.out.println(str + "Mohammad");

    }
}
