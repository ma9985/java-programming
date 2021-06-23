package day56_abstractionReview.greeting;

import day56_abstractionReview.greeting.Greetings;

public class Japanese implements Greetings {
    @Override
    public void hi() {
        System.out.println("Kanichiowa");
    }

    @Override
    public void bye() {
        System.out.println("shim fuss");
    }
}
