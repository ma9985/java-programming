package day56_abstractionReview.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage m1 = new MountainLanguage();
        m1.hi();
        m1.bye();

        Greetings g1 = new MountainLanguage();
        g1.hi();
        g1.bye();

        Japanese j1 = new Japanese();
        j1.hi();
        j1.bye();
    }
}
