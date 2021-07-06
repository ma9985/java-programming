package day58_polymorphism;

public abstract class OnlineShop {
    public abstract void sell();
    public abstract void buy();
    public void ship() {
        System.out.println("Shipping the purchased items");

    }
}
