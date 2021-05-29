package day48_constructors_static;

import day46_encapsulation.Car;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 =  new Customer();
        System.out.println(cs1.toString()); //print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); //create objects and assign values in the same statement
        Customer cs3 = new Customer("Idris", 7165);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Mohammad", 9985)};


        //arrayList of Customer Objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Mohammad", 9985));
        customerList.add(new Customer("Idris", 1019));

        //Print info of first customers object in array and arraylist
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList); // print toString info all customers objects
        System.out.println("-------FOR LOOP---------");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        System.out.println("-----FOR EACH LOOP----");
        for (Customer customer1 : customerList) {
            System.out.println(customer1);
        }

        //print only names of customers in the list 2 ways lamda and for loop
        System.out.println("------NAMES OF CUSTOMERS------");
        customerList.forEach( each -> System.out.println(each.getName()));

        for (Customer each : customerList){
        System.out.println(each.getName());
        }
    }
}
