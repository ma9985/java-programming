package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();

        //trafficLight.color = "red";  <----don't do this
        trafficLight.changeColor("red");
        trafficLight.showColor();

        trafficLight.changeColor("blue");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("Yellow");
        trafficLight2.showColor();
    }
}
