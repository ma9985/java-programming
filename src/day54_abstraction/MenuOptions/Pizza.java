package day54_abstraction.MenuOptions;

public class Pizza extends MenuItem {


    @Override
    public void prepare() {
        System.out.println("make the dough and put the toppings along with the cheese to bake it in oven");
    }

    @Override
    public void serve() {
        System.out.println("serve it on a plate or in a box");
    }
}
