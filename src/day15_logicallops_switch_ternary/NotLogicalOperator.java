package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        // check if age isn't more than 7. print "Need to sit child in car seat
        if (!(age > 7)) {
            System.out.println("Need to sit child in car seat");
        } else {
            System.out.println("Can sit in normal sit. age = " + age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Smoking is affordable " + isAffordable);
        }
        //i like tesla but don't want it
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword IS NOT equals secretPassword: print "Incorrect Password"
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("In correct password");
        }
    }
}
