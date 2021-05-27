package day40_arrayList;

import java.util.ArrayList;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");


            int count = shoppingList.size();
            System.out.println("Items to buy = " + count); //Items to buy = 7

            System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));

            if(shoppingList.contains("shoes")){
                System.out.println("Yes their is shoes in my list");
            } else {
                System.out.println("No their is no shoes on my list");
            }
        }
        System.out.println("buying shoes... $80");

       shoppingList.remove("shoes");

        System.out.println("list = " + shoppingList);

        System.out.println("we done shopping and lets get back coding ya habeby");
    }

}
