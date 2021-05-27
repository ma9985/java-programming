package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startInCar();
        shitToDrive();
        pressGasPedal();
    }
    public static void pressGasPedal() {
        System.out.println("4.Hold the steering wheel with two hands and press gas");
    }
    public static void sitInCar() {
        System.out.println("1.open door and sit in driver seat");
    }
    public static void startInCar() {
        System.out.println("2.insert the key in the ignition clockwise in cheap car habiby");
    }
    public static void shitToDrive() {
        System.out.println("3.Press on break and shift down to 'D'");
    }

}
