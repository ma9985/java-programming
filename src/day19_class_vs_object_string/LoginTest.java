package day19_class_vs_object_string;
/*
expUserName = "cybertek"
expPassword = "Abc123"

userName = "CYBERTEK"
password = "Abc123"

userName is not case sensitive
password is case sensitive

WHEN expUserName equals userName AND expPassword equals password
    -> "Pass - user successfully logged in"

OTHERWISE:
    WHEN expUserName NOT equals userName
        -> "Incorrect Username"
    OTHERWISE:
        -> "Incorrect password"
 */
public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";

        if(expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user successfully logged in");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("fail - incorrect username");
            } else {
                System.out.println("fail - incorrect password");
            }
        }

    }
}
