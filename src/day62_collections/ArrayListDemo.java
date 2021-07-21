package day62_collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();// polymorphism
        List<String> schools = new ArrayList<>();

        cities.add("McLean"); //add method from Collection or List interface
        cities.add("Vienna");
        cities.add("New York");

        System.out.println(cities);

        System.out.println("first city " + cities.get(0));
        System.out.println("count of cities = " + cities.size());
    }
}
