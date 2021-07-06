package day58_polymorphism;

public class Casting {

    public static void main(String[] args) {
        //variable of worker and object of superman
        Worker worker = new Superman();
        worker.getPaid();
        worker.work("QA Manager");

        ((Father)worker).raiseKid();
        ((Superman)worker).playWithKid();
    }
}
