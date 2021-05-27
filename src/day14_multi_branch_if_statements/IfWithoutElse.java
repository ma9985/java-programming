package day14_multi_branch_if_statements;
/*
year => 2020

check year equals 2020
    TRUE:
        print "Covid19 pandemic year"
        print "Wear mask, and keep 6 feet distance"
when we write if statement, else is block is not mandatory.
so we can write:
 */
public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2025;
        if (year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask, and keep 6 feet distance");
        }
        System.out.println("Keep quoting java");


        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("White House is on Pennsylvania Ave");
        }

        System.out.println("Welcome to " + country);
    }
}
/*
if (condition) {
    //code
} else {
    //code
}

if (condition) {
    //code
}
 */