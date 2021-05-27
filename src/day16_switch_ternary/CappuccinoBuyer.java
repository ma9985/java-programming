package day16_switch_ternary;
/*
declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90

when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"
 */
public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price = 0;
        double calories = 0;
        String size = "grande";

        switch(size) {   //if(size) {
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 780;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 4.99;
                calories = 120;
                break;
            case "venti":
                    System.out.println("Venti Cappuccino please");
                    price = 5.99;
                    calories = 2000;
                    break;
            default:  //optional if default is at the end
                System.out.println("We don't serve that"+size+" Cappuccino");
                break;
        }
        System.out.println("Total price: $" + price);
        System.out.println("You will consume "+ calories +" cals of energy");

    }
}
