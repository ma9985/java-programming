package day56_abstractionReview.greeting;

import day56_abstractionReview.greeting.Greetings;

public class MountainLanguage implements Greetings {


    @Override
    public void hi() {
        System.out.println("Ay walla");
    }

    @Override
    public void bye() {
        System.out.println("Yalla Bye");
    }
}
