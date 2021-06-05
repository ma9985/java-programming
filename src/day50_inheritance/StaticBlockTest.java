package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); // static  > constructor
        StaticBlockDemo st2 = new StaticBlockDemo(); //constructor
        StaticBlockDemo st3 = new StaticBlockDemo(); //constructor
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo str4 = new StaticBlockDemo(50);
        System.out.println("");
    }
}
