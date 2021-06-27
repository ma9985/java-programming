package day57_abstraction_polymorphism.polymorphysim;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Cat is saying <meow meow>");
    }
}