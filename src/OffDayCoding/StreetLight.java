package OffDayCoding;
/*
[Street light]
You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"
 */
public class StreetLight {
    public static void main(String[] args) {
        System.out.println("#### WHAT STREET LIGHT ARE YOU ON? ####");
        String streetLightColor = "Red";

        switch(streetLightColor) {
            case "Green light":
                System.out.println("Go");
                break;
            case "Yellow light":
                System.out.println("Slow down");
                break;
            case "Red light":
                    System.out.println("Stop");
                    break;
        }
        System.out.println("You must stop on a " + streetLightColor +" light");
    }
}
