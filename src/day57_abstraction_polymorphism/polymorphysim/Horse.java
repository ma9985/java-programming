package day57_abstraction_polymorphism.polymorphysim;

public class Horse extends Animal {
    @Override
    public void makeNoise(){
        System.out.println("Horse says neigh, neigh");
    }
}
