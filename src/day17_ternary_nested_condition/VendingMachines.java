package day17_ternary_nested_condition;
/*
selection = "drink" orr can be "snack"
drink = "tea" , "coke"
snack = "chips" , "candy"

when selection is "drink":
    "drink option is selected"
    when drink is "tea":
        "tea is selected"
    when drink is "coke":
        "coke is selected"
when selection is "snack"
    "snack option is selected"

    when snack is "chips":
        "chips item is selected"
    when snack is "candy":
        "candy item is selected"
 */
public class VendingMachines {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coke";
        String snackItem = "chips";

        if(selection.equals("drink")) {  //when selection is "drink"
            System.out.println("Drink option is selected"); // print "drink option is selected"
            if(drinkItem.equals("tea")) {     // when drink is "tea":
                System.out.println("tea item is selected");     // "tea is selected"
            } else {
                System.out.println("coke item is selected");   //"coke is selected"
            }
            } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if(snackItem.equals("chips")) {     //sncak otpions selected
                System.out.println("Chips option is selected");
            } else {
                System.out.println("candy option is selected");
            }
        }


    }
}
