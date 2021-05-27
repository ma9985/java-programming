package day15_logicallops_switch_ternary;
/*
onSale, freeShipping
itemName

use if statement with && , to check if you would add item in cart.
 */
public class AndOperatorsPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart- " + itemName);
        }else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }
        //
        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart- " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }
        //

    }
}
