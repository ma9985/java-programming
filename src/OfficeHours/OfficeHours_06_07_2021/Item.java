package OfficeHours.OfficeHours_06_07_2021;
/*
    -> Instance variables:
        - name (String), price (double), quantity (int)

    -> Constructor:
        - Accepts and initializes all three variables

    -> Instance methods:
        - toString(): returns information about Item
 */
public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
