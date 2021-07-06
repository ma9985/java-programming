package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.raiseKid();
        spMan1.feedKid();

        Worker spMan2 = new Superman();
        spMan2.getPaid();
        spMan2.work("SDET");

        Superman SDET = new Superman();
        SDET.getPaid();
        SDET.feedKid();
        SDET.playWithKid();
        SDET.raiseKid();
    }
}
