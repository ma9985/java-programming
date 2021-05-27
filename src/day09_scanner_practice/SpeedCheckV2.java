package day09_scanner_practice;
import java.util.Scanner;
/*
ask to enter current Speed
speedlimit -> 55
currentSpeed -> 75
overTheLimit -> currentSpeed - speedlimit;

You are driving 20 mph over the limit. Slow down!
 */
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed: ");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheSpeedLimit = currentSpeed - speedLimit;

        System.out.println("You are driving "+ overTheSpeedLimit +" mph over the speed limit");



    }
}
