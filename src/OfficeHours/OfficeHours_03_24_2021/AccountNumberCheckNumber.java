package OfficeHours.OfficeHours_03_24_2021;
/*
Declare a variable account number (String). You will check if these account numbers are valid.
    - If the account number begins with a “2” the account number should be 7 characters long
        -> Print: "Valid 7 digit account number"
            Otherwise: "Invalid 7 digit account number"
    - If the account number begins with a “5” the account number should be 10 characters long
        -> Print: "Valid 5 digit account number"
            Otherwise: "Invalid 5 digit account number"
    — If the account number does not begin with a 2 or a 5
        -> Print "Invalid account number"
 */
public class AccountNumberCheckNumber {
    public static void main(String[] args) {
        String accountNumber = "7654136";
        String accountNumberTwo = "591516001";

        if(accountNumber.startsWith("2")) {

            if(accountNumber.length() == 7)
            System.out.println("Valid 7 digit account number");
        } else {
            System.out.println("invalid 7 digit account number");

        } if(accountNumber.startsWith("591516001")){
            if(accountNumberTwo.length() == 10) {
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("invalid 10 digit account number");
            }

        }else {
            System.out.println("not a valid account number");
        }

        if (accountNumberTwo.startsWith("5") || accountNumberTwo.startsWith("5")) {
            System.out.println("invalid 10 digit account number");
        } else {
            System.out.println();
        }

    }
}
