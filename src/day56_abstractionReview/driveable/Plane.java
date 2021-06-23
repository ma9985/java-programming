package day56_abstractionReview.driveable;

import day56_abstractionReview.greeting.Greetings;

public class Plane extends Transportation implements SelfDriveable, Greetings {


    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 25.0) + " to fly " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }

    public void land() {
        System.out.println("Plane is landing - buckle up");
    }
}