package day15_logicallops_switch_ternary;
/* 1 - needs to be within budget
             AND
     2 - needs to be "Toyota" OR "Honda" OR "Tesla"
 */
public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Toyota";
        double carPrice = 4999;

        if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda")) {
            System.out.println("Ready to purchase model = " + model + " price " + carPrice);
        } else {
            System.out.println("Not interested in the model = " + model + " price " + carPrice);

        }
    }
}
