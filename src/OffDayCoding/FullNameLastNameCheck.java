package OffDayCoding;
/*
Given two String variables. One is a full name and the second a last name.
 Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name
 */
public class FullNameLastNameCheck {
    public static void main(String[] args) {
        String fullName = "James Bond";
        String lastName = "Bond";

        if(fullName.endsWith("Bond")) {
            System.out.println("yes it has the last name as string");
        } else {
            System.out.println("no it does not have last name");
        }
        String fullName1 = "alex benji";
        String lastName2 = "Bond";

        if (fullName1.endsWith("Bond")) {
            System.out.println("yes same last name");
        } else {
            System.out.println("not the same last name");
        }

    }
}
