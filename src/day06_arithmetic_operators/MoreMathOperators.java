package day06_arithmetic_operators;
// mutli line
public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas =431;
        int hondas = 233;
        int vw = 2;
        int teslas = 20;
        int nissan = 1;
        int bmw = 155;
        // now how to calculate below

        int totalCarsInParking = toyotas + hondas + vw + teslas + nissan + bmw;
        System.out.println("Their are " + totalCarsInParking + "cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;

        //we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("there are " + slicesPerPerson + " slices per person");
        System.out.println("We ordered " + pizza + " pizza with " + slices +  "slices," + people + "people ate 2 slices each");





    }
}
