package OfficeHours.OfficeHours_06_22_2022;
/*
Create a concrete class Ebay
    - Inherit OnlineShopping and implement all abstract methods

 */

public class Ebay extends OnlineShopping implements AllowsUsersToSell {


    @Override
    public void viewCart() {
        System.out.println("Viewing cart in Ebay");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Ebay");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Ebay seller");
    }
}
