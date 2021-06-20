package day54_abstraction.MenuOptions;

public class Salad extends MenuItem {
    @Override
    public void prepare() {
        System.out.println("chop veggies, add dressing");
    }

    @Override
    public void serve() {
        System.out.println("plate with fork and dressing on side");

    }
}
