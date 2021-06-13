package day53_inheritanceTesla.hidding;

public class Phone {
    String type = "Old school phone";

    public static void use(){
        System.out.println("Using the Phone");
    }
    public void call(){
        use();
        System.out.println("and making phone call");
    }
}
