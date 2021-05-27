package day13_conditional_statements;
// isHungry --> true/false
//check isHungry
//  true:
//      Print out "I am hungry I will go get something to eat"
//      "Then code java"
//   false :
//    - print out "I am not hungry, Lets keep coding java"

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;
        if (isHungry == true) {
            System.out.println("I am hungry, I will go get something to eat");
            System.out.println("Then code java");
        } else {
            System.out.println("I am not hungry, Lets keep coding java");
        }
        double price = 130.4;
        boolean isAffordable = price <= 200.00;
        if (isAffordable) {
            System.out.println("I can afford this?");
        } else {
            System.out.println("I cant do it, too much money");

        }
        boolean isRemoteJob = true;
        //if not remoteJob print _ " sorry i am not interested"
        // otherwise, print "sure i am interested, what is the interview process?"
        if (!isRemoteJob) {
            System.out.println("Sorry im not interested");
        } else {
            System.out.println("Sure, i am interested, what is the interview process?");
            //2.  can check if string value equals some other value. we cant compare if it is greater/less than
            //we can do equal comparison.
            // using == operator
            // String city = ;"FairFax";
            // if(city == "Fairfax")
            // }
            // print "it is fairfax

            // 2.  using equals () method/function
            // String city = "Los Angeles";
            // if (city.equals("los angeles")) {
            // else
            //print "it is not LA"


        }
    }
        }


