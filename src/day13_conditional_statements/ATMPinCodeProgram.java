package day13_conditional_statements;
// print "**welcome to td bank ATM**
//secretpincode __>>
//inputpincode -->>
//if condition checks if secretpincode equals inputpincode
// //true:
//"Welcome to your account"
//"you can withdraw, deposit, check balance,
// false :         "incorrect pincode! 1234"
//                  "please try again."
//Print "Thank you for using TD BANK ATM!"

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("****WELCOME TO TD BANK ATM******");
        int secretPinCode = 4136;
        int inputPin = 4136;
        if (secretPinCode == inputPin) {
            System.out.println("WELCOME TO YOUR ACCOUNT");
            System.out.println("YOU CAN DEPOSIT, WITHDRAW, DEPOSIT, CHECK YOUR BALANCE");
        } else {
            System.out.println("Incorrect pincode!");
            System.out.println("Please try again!");

        }
        System.out.println("Thank you for using TD BANK ATM!");

    }
}
