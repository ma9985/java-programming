package day18_conditions_practice_strings_intro;
/*
last4SSN
pinCode

expLast4SSN
expPinCode
------------------------------
when both match:
    "Authentication successful"
when expLast4SSN does not match:
    "Last 4 of SSN did not match"
when pinCode does not match:
    "pinCode did not match"
 */
public class Authentication {
    public static void main(String[] args) {
        int expLastSSN = 4136;
        int expPinCode = 1224;

        int last4SSN = 4136;
        int pinCode = 1224;


        if (last4SSN == expLastSSN && expPinCode == pinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication not successful");
            if (last4SSN != expLastSSN) {
                System.out.println("Last 4 SSN is incorrect");
            }
            if (expPinCode != pinCode) {
                System.out.println("pin code is incorrect");
            }
        }



    }
}
