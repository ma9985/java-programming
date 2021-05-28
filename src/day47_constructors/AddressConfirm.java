package day47_constructors;

public class AddressConfirm {
    public static void main(String[] args) {
        //to assign data u need to SET the data
        Address address1 = new Address();
        address1.setStreet("5915 west 88th St");
        address1.setCity("Oak Lawn");
        address1.setState("IL");
        address1.setZipcode("60453");
        address1.setCountry("USA");
        System.out.println(address1.toString());
        System.out.println("street info = " + address1.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("5915 west 88th street ");
        newAddress.setCity("Oak Lawn");
        newAddress.setState("IL");
        newAddress.setZipcode("60477");
        System.out.println(newAddress.toString());


        Address papaJon = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("papaJon = " + papaJon.toString());

    }


}
