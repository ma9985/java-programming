package day32_arrays_split;

import java.util.Arrays;


public class MallShopping {
    public static void main(String[] args) {
        //      0         1         2         3        4           5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("***************FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY****************");
        //use for loop with condition..we looking for index number here

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
                // System.out.println(i + " - " + items[i]);
            }

        }
        System.out.println("______set boolean to true if first ' ipad' is found___________");
        boolean ipadExits = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {   //<<------ we put ignore case cuz we need to find that word
                ipadExits = true;                    // regardless of the capital or lowercase
                break;
            }
        }
        System.out.println("ipads can = " + ipadExits);
        if (ipadExits) {
            System.out.println("we did buy ipad");
        } else {
            System.out.println(" we forgot ipad");
        }

        System.out.println("-----print a report of each shopping item----");
        /**
         * shoes - $99.99  - #12345
         * .....
         * iphone 12 case  - $39.99 - #123450
         */

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - \t$" + prices[i] + " - \t#" + itemIDs[i]);
        }
        System.out.println("-----look for 'Jacket' in items and print all details");
        /*
        jacket - $150.0 - #12346
         */

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + " - $"+ prices[i] + " - #"+itemIDs[i]);
                break; // stops searching after jacket is found
            }
        }
        System.out.println("--------find ");
    }
}

