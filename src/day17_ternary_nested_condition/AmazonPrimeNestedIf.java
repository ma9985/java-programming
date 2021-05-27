package day17_ternary_nested_condition;

/*
itemPrice = 30;
isPrimeMember = true;

when isPrimeMember is true
    print "Eligible for free 2 day shipping"
otherwise
    when itemPrice is more than 25
        print "Eligible for free regular shipping"
    otherwise
        print "Not eligible for free shipping. fee is $10"
 */
public class AmazonPrimeNestedIf {
    public static void main(String[] args) {
        double price = 26;
        boolean isPrimeMember = false;

        if (isPrimeMember) {   //when isPrimeMember is true
            System.out.println("Eligible for free 2 day shipping");  // print "Eligible for free regular shipping"
        } else {
            if (price >= 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }
    }
}
