package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // car list
        List<String> myCar = new ArrayList<>();
        myCar.add("toyota");
        myCar.add("mazda");
        myCar.add("ford");
        myCar.add("moskvich");
        myCar.add("tesla");
        myCar.add(0, "jeep");
        myCar.add(1, "lada");
        myCar.add(2, "yugo");
        System.out.println(myCar.toString()); // prints all cars
        String allCarsIn1st = myCar.toString(); //saves all cars in 1 string variable
        System.out.println("allCarsIn1st = " + allCarsIn1st);

        //change index 0 to Lamborghini
        myCar.set(0, "Lamborghini");
        System.out.println("after set  = " + myCar.toString());

        //change 4 index to Honda
        myCar.set(4, "Honda");
        System.out.println("after set 2 = " + myCar.toString());

        /**
         * How would you do that if myCars was array;
            myCars[4] = "Honda";
         */
        //find the index number of "ford"
        System.out.println("index of ford = " + myCar.indexOf("ford"));
        int moskvichIndex = myCar.indexOf("moskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        //change moskvich to jiguli
        myCar.set(moskvichIndex, " jiguli");
        System.out.println("after set to jiguli = " + myCar);

        //replace ford with trabant
        //indexOF("ford"), "trabant"

        myCar.set(myCar.indexOf("ford"),"trabant");
        System.out.println(myCar);

        //lada -> bugatti
        /*
        if myCar contains "lada"
             find index of lada and set value of bugatti
             else
             print "lada is not found"
         */
        if(myCar.contains("lada")){
            myCar.set(myCar.indexOf("lada"), "Bugatti");
            System.out.println("after set bugatti = " + myCar.toString());
        } else {
            System.out.println("lada not found");
        }
        System.out.println("after set bugatti = " + myCar.toString());


        /**
         Lambroghini -> prius
         lada -> lexus
         trabant -> audi
         */

        for(int i = 0; i < myCar.size(); i++) {
            if(myCar.get(i).equals("Lamborghini")) {
                myCar.set(i, "prius");
            }else if (myCar.get(i).equals("lada")) {
                myCar.set(i, "lexus");
            } else if(myCar.get(i).equals("trabant")) {
                myCar.set(i, "audi");
            }
        }
        System.out.println("for loop = " + myCar);
    }
}

