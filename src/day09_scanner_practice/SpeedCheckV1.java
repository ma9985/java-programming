package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTheSpeedLimit = currentSpeed - speedLimit;
        System.out.println("You are driving "+ overTheSpeedLimit +" mph over the speed limit");

        System.out.println("Speed Limit: " + speedLimit);
        System.out.println("Current Speed: " + currentSpeed);
        System.out.println("Over the speed limit: " + overTheSpeedLimit);



    }
}
