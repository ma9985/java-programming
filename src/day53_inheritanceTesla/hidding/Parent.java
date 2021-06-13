package day53_inheritanceTesla.hidding;

public class Parent {

    public String name = "Mohammad Abdelqader";
    public void introduce(){
        System.out.println("Hello I am " + name);
    }

}

class Child extends Parent {
    public String name = "child > Idris Abdelqader";

    public void introduce2() {
        System.out.println("Hello I am " + name);

    }
}
    class Runner{
        public static void main(String[] args) {
            Parent parent = new Parent();
            parent.introduce();
            Child child = new Child();
            child.introduce();
            child.introduce2();
        }
    }
