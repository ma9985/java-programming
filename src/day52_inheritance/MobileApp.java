package day52_inheritance;

public class MobileApp {
     private String name;
   private double version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    protected boolean download(){
        System.out.println("App: " + name +" version: " + version );
        return true;
    }
    protected void useTheApp(int minutes) {
        System.out.println("Using " + name + "app for " + minutes + " minutes");

    }
}
