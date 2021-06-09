package day50_inheritance.overridingExample;



public class Dog extends Animal{
    public void run() {
        System.out.println("Dog is running...");
    }
    @Override
public void speak(){
    System.out.println("dog is barking");
}
}
