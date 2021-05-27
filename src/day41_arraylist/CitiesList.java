package day41_arraylist;


import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add value to arraylist -> add methods
        cities.add("Washington DC"); //0
        cities.add("New York"); //1
        cities.add("Vienna");   //2
        cities.add("Adana");     //3
        cities.add("LA");       //4
        // add Mohammad to 0 index
        cities.add(0, "Mohammad");
        //print all values in same line
        System.out.println("cities = " + cities);
        //print first and last city
        System.out.println("first city = " + cities.get(0));//mohammad
        System.out.println("last city = " + cities.get(5)); //la
        //find last index using size()-1
        System.out.println("cities = " + cities.get(cities.size()-1));

        int size = cities.size();
        System.out.println("there are " + size +" cities in the list");

        //for loop and print all values in same line
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();
         //for each loop
        for(String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        //remove or delete from arraylist
        //1. remove using index. delete value at index 3
        cities.remove(3);
        //2. remove using object/value
        cities.remove("New York");

        System.out.println("after remove = " + cities);

        //delete/remove all values from list
        cities.clear();
        System.out.println("This is going to clear it = " + cities);

        //make sure it is clear
        //1. print|split it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }


    }
}
