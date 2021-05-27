package Day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        //declare 3 variables,
       //currentSpeed 45,
        //speedLimit - true is speeding , flase if not speeding
        // print "Are you speeding? - " true/flase

        int currentSpeed = 4_5; //45
        int speedLimit = 5_5;   //55
        System.out.println(currentSpeed > speedLimit); //false
        System.out.println(speedLimit < currentSpeed); //false

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +"mph");
        System.out.println("speeedLimit = " + speedLimit +"mph");

        currentSpeed += 20; //65 45+20 from above
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +"mph");
        System.out.println("speeedLimit = " + speedLimit +"mph");

        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice)); //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I afford = " + canAfford);

        //decrease balance by item price
       // accountBalance = accountBalance - itemPrice; //short way next line
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);




    }
}
