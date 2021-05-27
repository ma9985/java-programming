package day20_string_manipulationIntro;

public class StringContains {
    public static void main(String[] args) {
        String company = "capital one";
        System.out.println(company.contains("i"));  //true
        System.out.println(company.contains("ital")); // true
        System.out.println(company.contains("l o")); // true
        System.out.println(company.contains("j")); //false
        System.out.println(company.contains("One")); //false
        // if company contains space, print "multiple words company name"
        // else "single word company name"

        if (company.contains("")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("contains word company name");
        }
        String etsyTitle = "Wooden spoon | etsy";
        // check if " | " is in etsyTitle

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }
        String firstName = "mohammad";
        //check if firstName contains "a" and "e" at the same time
        if (firstName.contains("m") && firstName.contains("d")) {
            System.out.println("both a && d are present ");
        } else {
            System.out.println("both a && d are not present ");

            String firstName1 = "Nadir";
            if (firstName.contains("m") || firstName.contains("d")) {
                System.out.println("a or d is present");
            } else {
                System.out.println("a or d is not present");
            }
            String email = "moeq24@yahoo.com";
            if (email.contains("@") && email.endsWith(".com")) {
                System.out.println("valid email ");
            } else {
                System.out.println("invalid email");
            }
        }
        String email = "murodil@cybertekschool.com";

        //check if email contains "@" and ends with ".com"
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }


    }
}