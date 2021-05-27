package OfficeHours.OfficeHours_05_22_2021;

import OfficeHours.OfficeHours_05_19_2021.Birds;

public class MyBackYard {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        birdOne.setCanFly(true);
        System.out.println(birdOne.canFly());

        birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());

    }

}
