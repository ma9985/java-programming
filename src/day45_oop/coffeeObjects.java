package day45_oop;

public class coffeeObjects {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("number of drinks = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("myCoffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        //ADD ANOTHER COFFEE OBJECT, SET VALUES , CALL METHOD
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 = " + coffee1.getType());
        //assign coffee1 object to coffee2
                //hey java, point coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
               System.out.println("coffee2 type = " + coffee2.getType());
               coffee2.setType("Espresso");

                      Coffee coffee3 = new Coffee();
                       coffee3.setType("Frappucino");
                       //point to same object as coffee2
                       coffee3 = coffee2;
                       System.out.println("coffee3 type = " + coffee3.getType());

    }
}
