package OfficeHours.OfficeHours_06_22_2022;
/*

Create a concrete class Amazon
    - Inherit OnlineShopping and implement all abstract methods

 */
public class Amazon extends OnlineShopping {

@Override
    public void viewCart(){
    System.out.println("Viewing Amazon cart");
}
    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from Amazon");
    }
}

