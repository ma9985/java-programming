package day55_abstraction.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        Chromedriver driver1 = new Chromedriver();
        FireFoxDriver driver2 = new FireFoxDriver();
        WebDriver driver3 = new Chromedriver();

        driver1.get("http://www.google.com");
       // driver2.findElement();
    }


}
