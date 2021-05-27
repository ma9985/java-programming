package day16_switch_ternary;
/*
[House Buyer ] - Look at CappuccinoBuyer from class for an idea

You are buying a new house and need to collect information about the houses in a specific area.
 You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5),
 if it is a gated community or not, allow pets or not.

Make variables for all of that information. Given empty defaults for all except the neighborhood name.
Print the information once at the end.

    Data based on neighborhood name:
        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes

 */
public class HouseBuyer {
    public static void main(String[] args) {
        System.out.println("**** Let's see the market in house ****");
        String name = "Canyon";
        double price, rating;
        boolean gated, allowPets;

        switch(name) {

            case "Hills":
                price = 89000;
                rating = 4.0;
                allowPets = true;
                gated = false;
                break;
            case "Oaks":
                price = 75000;
                rating = 3.5;
                gated = true;
                allowPets = true;
                break;
            case "Highland":
                price = 150000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;
            case "Canyon":
                price = 201000;
                rating = 4.8;
                gated = true;
                allowPets = true;
                break;
            default:
                name = "invalid name";
                price = 0;
                rating = 0;
                gated = false;
                allowPets = false;
        }
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating = " + rating);
        System.out.println("gated = " + gated);
        System.out.println("pets allowed = " + allowPets);


    }
}
