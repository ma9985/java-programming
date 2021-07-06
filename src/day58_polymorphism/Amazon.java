package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime{
    @Override
    public void sell() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void primeShipping() {
        System.out.println("Free-2day shipping for prime users");
    }
}
