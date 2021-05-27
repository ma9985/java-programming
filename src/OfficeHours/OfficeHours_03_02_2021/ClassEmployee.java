package OfficeHours.OfficeHours_03_02_2021;

public class ClassEmployee {
    public static void main(String[] args) {
        String firstName = "Mohammad"; //done
        String lastName = "Abdelqader"; //done
        String companyName = "FIGM INC"; //done
        double salary = 102500;
        byte startDay = 12;//done
        String startMonth = "December";//done
        int startYear = 2021; //done
        boolean areTheyFullTime = true;
        String jobTitle = "Java Programmer";// done
        String address = "1600 New Lenox Rd Joliet, Illinois 60433";
        String email = "Moeq24@yahoo.com";
        double salaryAfter3Years = salary + (startDay + 1000);



        System.out.println("**********Welcome to FIGM INC***********");
        System.out.println("Welcome Mohammad to FIGM INC position");
        System.out.println("Your Start date as a " + jobTitle+ " will be on " + startMonth + " " + startDay + ',' + " " + startYear + '.');
        System.out.println("You are fulltime: " + areTheyFullTime + " and will be making roughly " + salary + '.');
        System.out.println("The address to our office location: \n " + address);
        System.out.println("__________________________________________________________");
        System.out.println("~~~~Contact information~~~~");
        System.out.println("The New Hire name: " + firstName + " " + lastName);
        System.out.println("Start date: " + startMonth + " " + startDay + ',' + " " + startYear);
        System.out.println("Email: " + email);
        System.out.println("Your expected salary after 3 years " + salaryAfter3Years);




    }
}
